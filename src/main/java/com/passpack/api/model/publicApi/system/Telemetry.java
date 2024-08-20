package com.passpack.api.model.publicApi.system;

import lombok.Data;

@Data
public class Telemetry {
    private long start;
    private long end;

    public Telemetry(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public Telemetry() {
        this.start = System.currentTimeMillis();
    }

    public long getElapsedInMs() {
        return end - start;
    }
    public void markEnd() {
        this.end = System.currentTimeMillis();
    }
}
