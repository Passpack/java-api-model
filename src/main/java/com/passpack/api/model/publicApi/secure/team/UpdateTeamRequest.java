package com.passpack.api.model.publicApi.secure.team;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.Data;

import java.io.Serializable;

@Data
public class UpdateTeamRequest extends CreateTeamRequest implements Serializable {
    private long id;
}
