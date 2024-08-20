
package com.passpack.api.model.publicApi.secure.organization;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.ArrayList;
import java.util.List;


@Data
@EqualsAndHashCode(callSuper=false)
public class CancelTeamInvitationRequest extends PasspackRequestObject  {
    private List<Long> cids = new ArrayList<>();
}
