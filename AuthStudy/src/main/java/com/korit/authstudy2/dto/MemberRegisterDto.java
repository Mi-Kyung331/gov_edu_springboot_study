///*
//두 번째
//    private String 생성 후
//*   이후 Controller 생성
//* */
//
//package com.korit.authstudy.dto;
//
//import com.korit.authstudy.domain.entity.Member;
//import lombok.Data;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Data
//@RequiredArgsConstructor
//public class MemberRegisterDto {
//
//    private String username;
//    private String password;
//    private String fullName;
//    private String email;
//
//    public Member toEntity(BCryptPasswordEncoder passwordEncoder) {
//        return Member.builder()
//                .memberName(username)
//                .password(passwordEncoder.encode(password))
//                .fullName(fullName)
//                .email(email)
//                .build();
//    }
//}
