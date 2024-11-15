package com.passpack.api.model.publicApi.secure.password;


public class PasswordGroupRoles {

    public static int ROLE_NONE = -1;
    public static int ROLE_DEFAULT = 0;
    public static int ROLE_OWNER = 1;
    public static int ROLE_DELEGATED_ADMIN = 2;
    public static int ROLE_READ_WRITE = 3;
    public static int ROLE_READ_ONLY = 4;

    public static int MAX_ID = ROLE_READ_ONLY;
    public static int MIN_ID = ROLE_DEFAULT;
}
