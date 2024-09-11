package com.passpack.api.model.publicApi;

import lombok.Data;

@Data
public abstract class PasspackRequestObject {
    protected int apiVersion = 1;
    protected String apiClient;
    protected String clientTZ;
    protected int clientOffsetInMinFromServer;
}
