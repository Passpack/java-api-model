package com.passpack.api.model.publicApi;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Status {
    private int code;
    private List<PasspackReturnCode> codes =  new ArrayList<>();
}
