package com.passpack.api.model.publicApi.secure.passwordVault;

import lombok.Data;

@Data
public class ListPasswordVaultEntry {
    private String vaultId;
    private String encryptionKey;
    private String dataKey;
    private String data;
    private int role;
    private int vaultType;
    private String ownerName;
    private String ownerOrganizationId;
    private long ownerCustomerId;
    private String publicKey;
    private String privateKey;

}
