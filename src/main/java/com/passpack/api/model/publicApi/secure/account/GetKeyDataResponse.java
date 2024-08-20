package com.passpack.api.model.publicApi.secure.account;

import com.passpack.api.model.publicApi.PasspackResponseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;



@Data
@EqualsAndHashCode(callSuper=false)
public class GetKeyDataResponse extends PasspackResponseObject  {
    private String data;
    private String publicKey;
    private String privateKey;
}
