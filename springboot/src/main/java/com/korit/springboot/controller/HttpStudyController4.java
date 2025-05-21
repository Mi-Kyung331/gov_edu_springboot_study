package com.korit.springboot.controller;

/*
    REST API (RESTful API)
    요청과 응답
    : https://m.blog.naver.com/codingbarbie/223233477242
    : https://hahahoho5915.tistory.com/54

    설계 규칙
    1. URL은 명사를 사용해야한다. (동사 사용 금지)
    2. URL 경로에 소문자를 사용해야한다.
    3. HTTP 메소드 활용 (GET, POST, PUT, PATCH,   DELETE)
    4. HTTP 응답 상태 코드 활용
    5. 계층 관계를 슬러쉬(/)로 표현, 하지만 URL 마지막에는 슬러시 포   함 X
    6. 파일 확장자는 URL에 포함 X (http://example.com/api/study/photo.jpg (x))
    7. 조회 시 쿼리 활용
    8. 리소스 간에 연관 관계가 있는 경우 '/리소스명/리소스ID/관계가 있는 다른 리소스명'
 */

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HttpStudyController4 {

    @GetMapping("/api/study/http/get")
    public ResponseEntity<Map<String, Object>> get() {
//        return new ResponseEntity<>(Map.of("name", "강미경", "age", 25), HttpStatus.BAD_REQUEST);
        return ResponseEntity.badRequest().body(Map.of("name", "강미경", "age", 25));
        // 둘 다 같은 return, 아래쪽이 더욱 편함
    }

}
