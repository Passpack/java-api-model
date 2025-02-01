package com.passpack.api.model.publicApi.secure.passwordVault;

import lombok.Data;

@Data
public class AssociateTeamsWithVaultResponseEntry {
    private long teamId;
    private int code;
}
