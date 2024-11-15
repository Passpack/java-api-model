package com.passpack.api.model.publicApi.secure.team;

import lombok.Data;

@Data
public class MultiManageTeamMembershipResponseEntry {
    private long userId;
    private long teamId;
    private int code;
}
