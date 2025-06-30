package com.korit.springboot.controller;

import com.korit.springboot.dto.Address;
import com.korit.springboot.dto.PostData;
import com.korit.springboot.dto.Student;
import com.korit.springboot.dto.param.SearchStudyDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class  HttpStudyController3 {

    /*
        주소에 값을 입력한다.
        파라미터를 통해 값을 입력한다.
        파라미터란 ?
            주소의 ? 뒤에 따라오는 key value 값을 의미한다.
        http://localhost:8080/api/⁕⁕⁕?파라미터(여러개의 데이터를 요청 시 &로 구분)

        POSTMAN
        params는 get요청 때에만 사용한다.
        get - 주는 것(하지만 받는 것도 있을 수 있다)
     */
    @GetMapping("/study/get")
    public String get(
            @RequestParam String name,
            @RequestParam String age
    ) {
        return "get 요청입니다.";
    }


    /*
        가능한 json으로 값을 입력한다.
        "{
            "key1": "value",
            "key2": value2,
            "key3": {
                key4: value3,
                key5: ["a", "b", "c", "d"]
            }
        }"

    @RequestBody 라는 어노테이션을 무조건 붙여야한다.
     */
    @PostMapping("/study/post")
    public String post(@RequestBody Map<String, Object> data) {
        System.out.println(data);
        System.out.println(data.get("age"));
        System.out.println(data.get("address"));

        Object data2 = data.get("address");
        Map<String, Object> map = (Map<String, Object>) data2;
        Object data3 = map.get("address4");
        List<String> list = (List<String>) data3;
        System.out.println(((Map<String, Object>) data.get("address")).get("address4"));

        return "post 요청입니다.";
    }

    @PostMapping("/study/post2")
    public String post2(@RequestBody PostData postData) {
        System.out.println(postData);
        System.out.println(postData.getAddress());
        Address add = postData.getAddress();
        System.out.println(add.getAddress4());

        return "post2 요청입니다.";
    }

    /*
    Class Student {name, age}

        get 요청
        /api/study/students
        응답: [{Student객체1}, {Student객체2}, {Student객체3}]

        post 요청
        /api/study/students
        응답: {students: "성공", data: {Student 객체}}
     */


    /*
    엔드포인트를 통해 학생 목록을 페이징 + 검색해서 제공하는 기능
        전체적인 구조
        1. 학생(Student) 객체를 1000명 무작위로 생성 (dto에 학생 객체 생성)
        2. 검색조건 (searchValue)가 있으면 필터링
        3. 페이징 처리 (page, count)
        4. 조건에 맞는 학생 리스트 postman에서 반환

        결과
        [프로토콜]://[호스트]:[포트]/[경로]?[쿼리스트링]
        http://localhost:8081/api/study/students?page=1&count=30&searchValue=김

        http - 프로토콜 = Http 프로토콜 사용
        localhost - 호스트(서버주소) = 현재 내 컴퓨터 (로컬 서버)
        8081 - 포트 번호 resources > application.properties > server.port=8081
        /api/study/students - 경로
        ?page=1&count=30&searchValue=김 - 요청에 필요한 조건

        page=1 - 1페이지를 요청함
        count=30 - 한 페이지에 최대 30명의 학생을 보여달라는 뜻
        searchValue=김 - 이름에 "김"이라는 글자가 포함된 학생만 필터링
     */
    @GetMapping("/study/students")
    public List<Student> students
    (SearchStudyDto searchStudyDto)
    {

//        List<Student> students = List.of(
//                new Student("김미경", 25),
//                new Student("이미경", 25),
//                new Student("박미경", 25),
//                new Student("최미경", 25),
//                new Student("허미경", 25)

//        );
        List<Student> students = new ArrayList<>();
        Random random = new Random();
        int startCode = 0xAC00; // 가
        int endCode = 0xd743;   // 힇

        random.nextInt(10);
        for (int i= 0; i < 1000; i++) {
           StringBuilder builder = new StringBuilder();
           builder.append((char) (startCode + random.nextInt(endCode - startCode + 1)));
           builder.append((char) (startCode + random.nextInt(endCode - startCode + 1)));
           builder.append((char) (startCode + random.nextInt(endCode - startCode + 1)));
           students.add(new Student(builder.toString(), random.nextInt(100) + 1));
        }

        if (searchStudyDto.getPage() < 1) {
            searchStudyDto.setPage(1);
        }

        /*
            page = 1;  >  0
            page = 2   >  10
            page = 3   >  20
         */

        List<Student> foundStudents = students;
        if (searchStudyDto.getSearchValue() != null && !searchStudyDto.getSearchValue().isBlank()) {
            foundStudents = students
                    .stream()
                    .filter(student -> student.getName().contains(searchStudyDto.getSearchValue()))
                    .collect(Collectors.toList());
        }

        int startIndex = (searchStudyDto.getPage() - 1) * searchStudyDto.getCount();
        List<Student> newStudents = new ArrayList<>();
        for (int i = 0; i < (foundStudents.size() < searchStudyDto.getCount() ? foundStudents.size() : searchStudyDto.getCount()); i++) {
            try {
                newStudents.add(foundStudents.get(startIndex + i));
            } catch (Exception e) {
                break;
            }
    }

        return newStudents;
    }

    @PostMapping("/study/students")
    public Map<String, Object> student2(@RequestBody Student s) {
        return Map.of("status", "성공", "data", s);


    }



    /*
        json으로 값을 입력한다.
        데이터 수정
     */
    @PutMapping("/study/put")
    public String put() {
        return "put 요청입니다.";
    }


    /*
        경로에 값을 입력한다.
        가능한 하나의 데이터를 명확하게 찝어서 지울 수 있게 해야함.
        api/study/delete/book/10
     */
    @DeleteMapping("/study/delete/{category}/{id}")
    public String delete(@PathVariable String category, @PathVariable Long id) {
        return "delete 요청입니다.";
    }

}
