package com.ridelog.backend.dto.users;

import lombok.Data;

@Data
public class UsersRequest {

    private String fullName;

    private String username;

    private String email;

    private String password;
    
}
