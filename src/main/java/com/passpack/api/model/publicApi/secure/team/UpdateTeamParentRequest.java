package com.passpack.api.model.publicApi.secure.team;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import com.passpack.api.model.publicApi.secure.password.PasswordGroupRoles;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class UpdateTeamParentRequest extends PasspackRequestObject  {
    private String parentId;
    private long teamId;
}
