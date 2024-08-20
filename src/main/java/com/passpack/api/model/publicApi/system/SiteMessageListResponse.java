package com.passpack.api.model.publicApi.system;

import com.passpack.api.model.publicApi.PasspackResponseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.ArrayList;
import java.util.List;


@Data
@EqualsAndHashCode(callSuper=false)
public class SiteMessageListResponse extends PasspackResponseObject  {
    private List<SiteMessageListEntry> entries = new ArrayList<>();
}
