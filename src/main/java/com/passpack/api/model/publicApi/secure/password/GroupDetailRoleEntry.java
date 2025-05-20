package com.passpack.api.model.publicApi.secure.password;

import lombok.Data;

@Data
public class GroupDetailRoleEntry {

    private long id;
    private int role;
    private int shareType;
    private String username;
    private boolean apiUser = false;

    public GroupDetailRoleEntry() {
    }

    public GroupDetailRoleEntry(long id, int role, int shareType, String username, boolean apiUser) {
        this.id = id;
        this.role = role;
        this.shareType = shareType;
        this.username = username;
        this.apiUser = apiUser;
    }


}
