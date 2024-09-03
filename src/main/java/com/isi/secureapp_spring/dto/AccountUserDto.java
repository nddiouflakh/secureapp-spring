package com.isi.secureapp_spring.dto;

import lombok.Data;

@Data
public class AccountUserDto {
    private Long id;
    private String email;
    private String password;
    private Boolean status;
}
