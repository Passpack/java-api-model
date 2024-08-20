package com.passpack.api.model.publicApi.secure.sharing;

import lombok.Data;

@Data
public class BulkUserPublicKeyEntry {
    private long connectionId;
    private String publicKey;
}
