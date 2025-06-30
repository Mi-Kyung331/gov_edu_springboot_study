package com.korit.springboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
    HttpServletRequest 객체란?
    외부에서 Tomcat 웹 서버로 요청 시 생성되는 요청정보객체이다.

 */

@RestController
public class HttpServletRequestController {

    @GetMapping("/api/name2")
    public String getName2(
            @RequestParam(required = false) String a,
            @RequestParam(required = false) int b) {
        System.out.println(a);
        System.out.println(b + 10);
        return "강미경";
    }

}
