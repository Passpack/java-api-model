package com.passpack.api.model.publicApi.secure.passwordVault;

import lombok.Data;

@Data
public class AssociateTeamWithVaultRequestEntry {
    private long teamId;
    private String encryptedTeamKey;
}
