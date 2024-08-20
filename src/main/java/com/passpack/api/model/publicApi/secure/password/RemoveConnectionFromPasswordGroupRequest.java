package com.passpack.api.model.publicApi.secure.password;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper=false)
public class RemoveConnectionFromPasswordGroupRequest extends PasspackRequestObject  {
    private long otherId;
    @Builder.Default
    private List<Long> groupIds = new ArrayList<>();

}
