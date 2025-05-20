package com.passpack.api.model.publicApi.secure.team;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import com.passpack.api.model.publicApi.secure.password.PasswordGroupRoles;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CreateTeamRequest extends PasspackRequestObject  {
    private String encryptedGroupKey;
    private String parentId;
    private String vaultId;
    private String directoryId;
    private String data;
    private boolean defaultTeam = false;
    private int version = 2;
    private String encryptedTeamKeyForVault;
    private int defaultRoleForGroupMembers = PasswordGroupRoles.ROLE_READ_ONLY;
}
