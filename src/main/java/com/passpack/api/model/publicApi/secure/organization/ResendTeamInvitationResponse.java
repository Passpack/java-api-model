package com.passpack.api.model.publicApi.secure.organization;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.passpack.api.model.publicApi.PasspackResponseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@JsonSerialize()
@EqualsAndHashCode(callSuper=false)
public class ResendTeamInvitationResponse extends PasspackResponseObject {

}
