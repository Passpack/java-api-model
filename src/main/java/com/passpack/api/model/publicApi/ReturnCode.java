package com.passpack.api.model.publicApi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ReturnCode extends PasspackReturnCode implements IReturnCode {
    public ReturnCode() {
    }

    public ReturnCode(int code, String id) {
        super(code, id);
    }
}