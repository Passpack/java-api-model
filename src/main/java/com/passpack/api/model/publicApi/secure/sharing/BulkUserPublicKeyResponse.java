package com.passpack.api.model.publicApi.secure.sharing;

import com.passpack.api.model.publicApi.PasspackResponseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class BulkUserPublicKeyResponse extends PasspackResponseObject  {
    private List<BulkUserPublicKeyEntry> publicKeys = new ArrayList<>();
}
