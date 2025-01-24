package com.passpack.api.model.publicApi.secure.passwordVault;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AssociateTeamsWithVaultRequest extends PasspackRequestObject {
    private String vaultId;
    private List<AssociateTeamWithVaultRequestEntry> entries = new ArrayList<>();
}
