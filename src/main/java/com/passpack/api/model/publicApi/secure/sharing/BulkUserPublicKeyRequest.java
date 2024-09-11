package com.passpack.api.model.publicApi.secure.sharing;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper=false)
public class BulkUserPublicKeyRequest extends PasspackRequestObject  {
    private Set<Long> connectionIds = new HashSet<>();
}
