package com.passpack.api.model.publicApi;

import com.passpack.api.model.publicApi.system.Telemetry;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class PasspackResponseObject {
    protected Status status = new Status();
    protected Telemetry telemetry = new Telemetry();
    private Set<Integer> actions =  new HashSet<Integer>();;
}
