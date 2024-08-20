package com.passpack.api.model.publicApi.secure.account.billing;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.*;

@Data
@AllArgsConstructor @NoArgsConstructor @Builder
@EqualsAndHashCode(callSuper=false)
public class AddLicenseRequest extends PasspackRequestObject {
    // The number of licenses to add to the organization.
    private int requestedLicenses;
}


