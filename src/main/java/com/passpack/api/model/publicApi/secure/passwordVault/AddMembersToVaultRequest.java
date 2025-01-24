package com.passpack.api.model.publicApi.secure.passwordVault;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AddMembersToVaultRequest extends PasspackRequestObject {
    private String vaultId;
    private List<AddLicenseHolderToVaultEntry> entries = new ArrayList<>();
}
