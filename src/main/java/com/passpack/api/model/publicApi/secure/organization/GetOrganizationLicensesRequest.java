
package com.passpack.api.model.publicApi.secure.organization;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.*;

@Data
@NoArgsConstructor @AllArgsConstructor @Builder
@EqualsAndHashCode(callSuper=false)
public class GetOrganizationLicensesRequest extends PasspackRequestObject {
    @Builder.Default
    private boolean includeNonLicensedUsers = false;

}
