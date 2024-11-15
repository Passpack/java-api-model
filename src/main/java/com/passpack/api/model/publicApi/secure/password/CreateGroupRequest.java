package com.passpack.api.model.publicApi.secure.password;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CreateGroupRequest extends PasspackRequestObject  {

    private String name;
    private String color;
    private String metadataKey;
    private String description;
    private String encryptedGroupKey;
    private String vaultId;
    private String data;
    private boolean defaultTeam = false;
    private int version = 1;
    private String encryptedTeamKeyForVault;
    private int defaultRoleForGroupMembers = -1;
}
