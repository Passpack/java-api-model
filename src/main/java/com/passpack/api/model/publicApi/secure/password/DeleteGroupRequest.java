package com.passpack.api.model.publicApi.secure.password;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.*;



@Data
@Builder @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class DeleteGroupRequest extends PasspackRequestObject  {
    private long id;
}
