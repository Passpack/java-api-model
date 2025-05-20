package com.passpack.api.model.publicApi.secure.team;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.passpack.api.model.publicApi.secure.password.GroupDetailResponse;

import java.io.Serializable;

@SuppressWarnings("ALL")
@JsonSerialize()
@JsonInclude(value= JsonInclude.Include.NON_NULL)
public class UpdateTeamResponse extends GroupDetailResponse implements Serializable {
}
