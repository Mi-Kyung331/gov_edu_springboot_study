///*
//* 첫 번째 셋팅 ENTITY 셋팅
//    * MYSQL에서 셋팅한 table을 연결해준다.
//    * domain > entity > member
//    *
//    * 이후 DTO 생성
//* */
//
//package com.korit.authstudy.domain.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "members_tb")
//public class Member {
//
//    // PK(MYSQL) 세팅
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "member_id")
//    private Integer id;
//
//    private String memberName;
//    private String password;
//    private String fullName;
//    private String email;
//}
