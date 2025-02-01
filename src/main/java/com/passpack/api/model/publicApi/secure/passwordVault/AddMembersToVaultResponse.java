package com.passpack.api.model.publicApi.secure.passwordVault;

import com.passpack.api.model.publicApi.PasspackResponseObject;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class AddMembersToVaultResponse extends PasspackResponseObject implements Serializable {
    private List<AddLicenseHolderToVaultResponseEntry> entries = new ArrayList<>();
}
