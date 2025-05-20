package com.passpack.api.model.publicApi.secure.scim;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ScimTeamEntry {
    private long id;
    private String data;
    private int version;
    private int status;
    private int defaultRole;
    private String vaultId;
    private String directoryId;
    private String parentId;
    private String encryptedGroupKey;
    private List<ScimMemberEntry> members = new ArrayList<>();
}
