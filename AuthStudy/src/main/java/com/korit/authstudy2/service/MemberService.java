///*
//* 네 번째
//* */
//
//package com.korit.authstudy.service;
//
//import com.korit.authstudy.dto.MemberRegisterDto;
//import com.korit.authstudy.domain.entity.Member;
//import com.korit.authstudy.repository.MemberRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class MemberService {
//
//    private final BCryptPasswordEncoder passwordEncoder;
//    private final MemberRepository memberRepository;
//
//    public Member register(MemberRegisterDto dto) {
//        Member insertedUser = memberRepository.save(dto.toEntity(passwordEncoder));
//        return insertedUser;
//    }
//}
