package com.passpack.api.model.publicApi.system;

import lombok.Data;
import lombok.Getter;

@Data
public class Telemetry {
    private long start = 0;
    private long end= 0;
//    @Getter(lazy = true)
//    private final long duration = end-start;
    private long duration = 0;

    public Telemetry(long start, long end) {
        this.start = start;
        this.end = end;
    }


    public Telemetry() {
        this.start = System.currentTimeMillis();
    }

    public void markEnd() {
        this.end = System.currentTimeMillis();
        this.duration = end-start;
    }
}
