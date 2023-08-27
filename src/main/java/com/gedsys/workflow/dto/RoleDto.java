package com.gedsys.workflow.dto;

public class RoleDto {
    public RoleDto(String id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    private String id;

    private String desc;

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }
}
