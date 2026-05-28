package com.ridelog.backend.dto.users;

import java.time.LocalDateTime;

import com.ridelog.backend.enums.RoleUserEnum;

import lombok.Data;

@Data
public class UsersResponse {

    private Long id;

    private String fullName;

    private String username;

    private String email;

    private RoleUserEnum role;

    private LocalDateTime createdAt;
    
}
