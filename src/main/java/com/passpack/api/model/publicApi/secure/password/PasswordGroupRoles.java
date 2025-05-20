package com.passpack.api.model.publicApi.secure.password;


public class PasswordGroupRoles {

    public static final int ROLE_NONE = -1;
    public static final int ROLE_DEFAULT = 0;
    public static final int ROLE_OWNER = 1;
    public static final int ROLE_DELEGATED_ADMIN = 2;
    public static final int ROLE_READ_WRITE = 3;
    public static final int ROLE_READ_ONLY = 4;

    public static final int MAX_ID = ROLE_READ_ONLY;
    public static final int MIN_ID = ROLE_DEFAULT;
}
