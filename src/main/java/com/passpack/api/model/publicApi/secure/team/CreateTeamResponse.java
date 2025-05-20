package com.passpack.api.model.publicApi.secure.team;

import com.passpack.api.model.publicApi.PasspackResponseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=false)
public class CreateTeamResponse extends PasspackResponseObject  {
    private long id;
  
}
