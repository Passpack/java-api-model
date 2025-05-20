package com.passpack.api.model.publicApi.secure.scim;

import lombok.Data;

@Data
public class ScimMemberEntry {
    private long id;
    private int role;
}
