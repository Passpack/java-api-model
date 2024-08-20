package com.passpack.api.model.publicApi.system;

import lombok.Data;

import java.util.Date;

@Data
public class SiteMessageListEntry {
    private String id;
    private String type;
    private String icon;
    private String iconSize;
    private String iconClass;
    private String message;
    private String messageClass;
    private String action;
    private Date expires;

}
