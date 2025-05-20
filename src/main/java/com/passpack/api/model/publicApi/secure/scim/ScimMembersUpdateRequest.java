package com.passpack.api.model.publicApi.secure.scim;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class ScimMembersUpdateRequest extends PasspackRequestObject {
    private List<ScimTeamMemberUpdateEntry> updates = new ArrayList<>();
}
