//package com.korit.authstudy2.controller;
//
//import com.korit.authstudy.dto.MemberRegisterDto;
//import com.korit.authstudy.service.MembersService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequiredArgsConstructor
//public class MemberController {
//
//    private final MembersService membersService;
//
//    //    // User > Dto > Repository > Service > Response > DB
//  //    /*
//  //    오류 떴을 때
//  //    * 1. 404 - 경로찾을 수 없음, conroller에서 틀림
//  //      2. filed - entity 잘못
//  //      3. null - controller  dto에서 틀림
//  //
//  //      4. 500 - clas위에 어노테이션 등록 안 했을 때
//  //               의존성 주입
//  //    * */
//
//    @PostMapping("/api/members")
//    public ResponseEntity<?> register(@RequestBody MemberRegisterDto dto) {
//    // json이 들어왔을때만 @RequestBody를 붙인다.
//    // 그렇기에 get요청이 들어왔을 때엔 @RequestBody를 붙이지 않는다.
//        // getClass().getName() + "@" + Integer.toHexString(hashCode());
//        // com.korit.authstudy.dto.MemberRegisterDto + @ + 72dc7ee9
//        membersService.register(dto);
//        return ResponseEntity.ok(null);
//    }
//
//    @GetMapping("/api/members")
//    public ResponseEntity<?> getUser() {
//        return ResponseEntity.ok(null);
//    }
//}
