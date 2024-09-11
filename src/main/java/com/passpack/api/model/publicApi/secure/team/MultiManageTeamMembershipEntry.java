package com.passpack.api.model.publicApi.secure.team;

import lombok.Data;



@Data
public class MultiManageTeamMembershipEntry  {
    public static final int ACTION_TYPE_ADD = 1;
    public static final int ACTION_TYPE_REMOVE = 2;
    public static final int ACTION_TYPE_UPDATE = 3;
    private long gid;
    private long memberId;
    private int role;
    private String gk;
    private int action = 3; // 1 == add, 2 == remove, 3 == update
}
