package com.passpack.api.model.publicApi.secure.team;

import com.passpack.api.model.publicApi.PasspackResponseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;


@Data
@EqualsAndHashCode(callSuper=false)
public class MultiManageTeamMembershipResponse extends PasspackResponseObject  {
    private List<MultiManageTeamMembershipResponseEntry> entries = new ArrayList<>();
}
