package com.korit.springboot.controller.domain.dto;

import com.korit.springboot.controller.domain.entity.DoctorEntity;
import lombok.Data;

@Data
public class DoctorRegisterDto {

    private String doctorName;
    private String departmentName;

    public DoctorEntity toEntity() {
        return DoctorEntity.builder()
                .doctorName(doctorName)
                .build();
    }

}
