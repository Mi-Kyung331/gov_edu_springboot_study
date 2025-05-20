package com.korit.springboot.controller;

// 요청 URL : /api/age 응답 데이터: Map - { name: 김준일, age: 32 }
// 요청 URL : /api/names 응답 데이터: List - ["김준일", "김준이", "김준삼"]
// 요청 URL : /api/students 응답 데이터: [{name: "김준일", age: 32}, {name: "김준이", age: 33}]
// 요청 URL : /api/students2 응답 데이터:
/*
    [
        {
            name: 김준일,
            age: 32,
            hobby : [축구, 농구]
        },
        {
            name: 김준이,
            age: 33,
            hobby: [골프, 낚시]
        }
    ]
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HttpStudyController2 {

    @GetMapping("/age")
    public Map<String, Object> getAge() {
        Map<String, Object> age = new HashMap<>();
        age.put("name", "강미경");
        age.put("age", 25);
        return age;
    }

    // 안에 값을 추가하고 빼는 것이 안된다.
    @GetMapping("/age2")
    public Map<String, Object> getAge2() {
        return Map.of("name", "강미경", "age", 25);
    }


    @GetMapping("/names")
    public List<String> getName() {
        List<String> name = new ArrayList<>();
        name.add("강미경");
        name.add("강미경경");
        name.add("강미경경경");
        return name;
    }

    @GetMapping("/names2")
    public List<String> getName2   () {
        return List.of("강미경", "강미경경", "강미경경경");
    }



    @GetMapping("/address")
    public Map<String, Object> map() {
        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "강미경");
        map1.put("age", 25);
        map1.put("address", "부산 광역시 금정구");

        return map1;
    }

    @GetMapping("/address2")
    public Map<String, Object> map2() {
        Map<String, Object> map2 = Map.of("name", "강미경", "age", 25);
        map2.put("address", "부산 광역시 금정구");

        return map2;
    }



    @GetMapping("/students")
    public List<Map<String, Object>> getStudent() {
        List<Map<String, Object>> student = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "강미경");
        map1.put("age", 25);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "강미경경");
        map2.put("age", 26);

        student.add(map1);
        student.add(map2);

        return student;
    }

//    @GetMapping("students2")
//    public List<Map<String, Object>> getStudent2() {
//        return List.of(
//                Map.of("name", "강미경", 25),
//                Map.of("name", "강미경경", 26)
//        );
//    }



    @GetMapping("student2")
    public List<Map<String, Object>> getStudent3() {
        List<Map<String, Object>> student2 = new ArrayList<>();

        Map<String, Object> map3 = new HashMap<>();
        map3.put("name", "강미경");
        map3.put("age", 25);
        List<String> hobby = new ArrayList<>();
        hobby.add("축구");
        hobby.add("농구");



        student2.add(map3);


        return student2;

    }

}
