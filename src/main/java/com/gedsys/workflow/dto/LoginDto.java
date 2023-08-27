package com.gedsys.workflow.dto;

import javax.validation.constraints.NotNull;

public class LoginDto {
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    @NotNull
    private String user;

    @NotNull
    private String password;



}
