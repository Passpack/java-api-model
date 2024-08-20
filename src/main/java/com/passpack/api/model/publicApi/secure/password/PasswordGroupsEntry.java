package com.passpack.api.model.publicApi.secure.password;

import lombok.Data;



@Data
public class PasswordGroupsEntry  {
    private long id;
    private String name;
    private String color;
    private String description;
    private String owner;
    private int role;
    private int defaultRole;
    private int status;
}
