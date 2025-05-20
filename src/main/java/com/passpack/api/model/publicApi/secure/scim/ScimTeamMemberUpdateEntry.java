package com.passpack.api.model.publicApi.secure.scim;

import lombok.Data;

@Data
public class ScimTeamMemberUpdateEntry {
    private long id;
    private String status;
    private String firstName;
    private String lastName;
}
