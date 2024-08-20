
package com.passpack.api.model.publicApi.secure.organization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class InviteOrganizationTeamMembersEntry {
    private String firstName;
    private String lastName;
    private String email;
    private String sso;
}
