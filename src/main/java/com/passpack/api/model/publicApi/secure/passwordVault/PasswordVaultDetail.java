package com.passpack.api.model.publicApi.secure.passwordVault;

import lombok.Data;

@Data
public class PasswordVaultDetail {
    private String name;
    private String description;
    private int version;
    private int vaultType= PasswordVaultTypes.PASSWORD_VAULT_TYPE_PRIVATE;
}
