package com.passpack.api.model.publicApi.secure.team;

import lombok.Data;

import java.util.List;

@Data
public class TeamEncryptedData {
    private int version;
    private String color;
    private String description;
    private String name;
    private int defaultRole;
    private boolean defaultTeam;
    private String scimGroupId;
    private int scimType;
    private List<String> childScimGroupIds;
}
