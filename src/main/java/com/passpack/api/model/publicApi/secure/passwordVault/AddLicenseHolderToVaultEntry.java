package com.passpack.api.model.publicApi.secure.passwordVault;

import lombok.Data;

@Data
public class AddLicenseHolderToVaultEntry {
    private long customerId;
    private String encryptionKey;
    private String dataKey;
    private int role;
}
