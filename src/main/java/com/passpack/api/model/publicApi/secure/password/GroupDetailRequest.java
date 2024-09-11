package com.passpack.api.model.publicApi.secure.password;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.*;



@Data
@NoArgsConstructor @AllArgsConstructor @Builder
@EqualsAndHashCode(callSuper=false)
public class GroupDetailRequest extends PasspackRequestObject  {
    private long id;
}
