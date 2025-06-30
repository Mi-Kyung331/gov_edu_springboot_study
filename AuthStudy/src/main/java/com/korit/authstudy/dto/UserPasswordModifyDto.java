package com.korit.authstudy.dto;

import com.korit.authstudy.domain.entity.User;
import lombok.Data;

@Data
public class UserPasswordModifyDto {
    private String newPassword;
    private String oldPassword;
    private String newPasswordCheck;
}
