package com.korit.springboot.controller.clinic;


import com.korit.springboot.controller.domain.dto.DoctorRegisterDto;
import com.korit.springboot.mapper.service.DoctorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class DoctorController {

    private DoctorService doctorService;

    /*
        {
            doctorName:
            departmentName:
        }
     */


    @PostMapping("/api/clinic/doctors")
    public ResponseEntity<?> register(@RequestBody DoctorRegisterDto dto) {
        doctorService.register(dto);
        return ResponseEntity.ok(null);
    }

}
