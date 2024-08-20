package com.passpack.api.model.publicApi.secure.password;

import com.passpack.api.model.publicApi.PasspackResponseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class GroupDetailResponse extends PasspackResponseObject  {
    private long id;
    private String name;
    private String color;
    private String description;
    private String owner;
    private long ownerId;
    private int role;
    private int defaultRole;
    private int groupStatus;
    private String encryptedGroupKey;
    private String metadataKey;
    private List<GroupDetailRoleEntry> roles = new ArrayList<>();

}

