package com.passpack.api.model.publicApi.secure.organization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data @Builder
public class OrganizationLicenseListEntry {
    private String username;
    private String name;
    private String email;
    private String status;

    private long customerId;
    @Builder.Default
    private List<String> roles = new ArrayList<>();
    private String mfa;
    private boolean domainVerified;
    private boolean memberOtherOrganization = false;
    private String lastLogin;
    private Map<String,String> attributes = new HashMap<>();
}
