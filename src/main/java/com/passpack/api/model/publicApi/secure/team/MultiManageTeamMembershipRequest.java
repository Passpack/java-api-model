package com.passpack.api.model.publicApi.secure.team;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
public class MultiManageTeamMembershipRequest extends PasspackRequestObject  {
    List<MultiManageTeamMembershipEntry> entries = new ArrayList<>();

}
