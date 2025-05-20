package com.passpack.api.model.publicApi.secure.scim;

import com.passpack.api.model.publicApi.PasspackRequestObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class ScimReportRunRequest extends PasspackRequestObject {
    private List<String> errors= new ArrayList<>();
    private List<String> notices = new ArrayList<>();
    private long elapsedTimeMs;
}
