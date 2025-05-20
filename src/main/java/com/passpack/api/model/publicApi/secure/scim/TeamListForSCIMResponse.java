package com.passpack.api.model.publicApi.secure.scim;

import com.passpack.api.model.publicApi.PasspackResponseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class TeamListForSCIMResponse extends PasspackResponseObject  {
    private List<ScimTeamEntry> teams = new ArrayList<>();
}
