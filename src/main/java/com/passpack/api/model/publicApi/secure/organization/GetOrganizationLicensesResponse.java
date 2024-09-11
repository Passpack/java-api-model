package com.passpack.api.model.publicApi.secure.organization;

import com.passpack.api.model.publicApi.PasspackResponseObject;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data @Builder
@EqualsAndHashCode(callSuper=false)
public class GetOrganizationLicensesResponse extends PasspackResponseObject {
    @Builder.Default
    private List<OrganizationLicenseListEntry> licenses = new ArrayList<>();
    @Builder.Default
    private List<OrganizationLicenseListEntry> notLicensed = new ArrayList<>();
}
