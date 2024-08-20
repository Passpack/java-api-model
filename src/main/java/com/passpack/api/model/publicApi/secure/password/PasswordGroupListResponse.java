package com.passpack.api.model.publicApi.secure.password;

import com.passpack.api.model.publicApi.PasspackResponseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class PasswordGroupListResponse extends PasspackResponseObject  {
    private List<PasswordGroupsEntry> groups = new ArrayList<>();
}
