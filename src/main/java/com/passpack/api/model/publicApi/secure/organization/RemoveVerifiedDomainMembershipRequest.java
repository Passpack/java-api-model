
package com.passpack.api.model.publicApi.secure.organization;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class RemoveVerifiedDomainMembershipRequest extends PasspackRequestObject  {
    private List<Long> customerIds = new ArrayList<>();
    private boolean inApp = false;
}
