package com.gedsys.workflow.dto;

import javax.validation.constraints.NotNull;

public class TokenDto {

    @NotNull
    private String token;

    public TokenDto(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
