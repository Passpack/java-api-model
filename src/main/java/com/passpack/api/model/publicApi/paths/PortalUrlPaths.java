package com.passpack.api.model.publicApi.paths;

public class PortalUrlPaths {

    private static final String BASE_API_PATH = "";
    private static final String CURRENT_API_VERSION = "v1";
    private static final String CURRENT_BASE_API_PATH = BASE_API_PATH + "/" + CURRENT_API_VERSION;
    private static final String V2_BASE_API_PATH = BASE_API_PATH + "/v2";
    private static final String SECURE_BASE = CURRENT_BASE_API_PATH + "/secure";
    private static final String SECURE_BASE_V2 = V2_BASE_API_PATH + "/secure";
    private static final String SECURE_PASSWORD_BASE = SECURE_BASE + "/password";

    // CSRF
    public static final String CSRF_GENERATOR_PATH = BASE_API_PATH + "/csrf/generate";

    // Login/logout
    public static final String LOGIN_PATH = CURRENT_BASE_API_PATH + "/login";
    public static final String LOGIN_AZURE_PATH = BASE_API_PATH + "/azureLogin";
    public static final String LOGIN_GOOGLE_PATH = BASE_API_PATH + "/googleLogin";
    public static final String LOGIN_OKTA_PATH = BASE_API_PATH + "/oktaLogin";
    public static final String LOGOUT_PATH = CURRENT_BASE_API_PATH + "/logout";

    // Passwords
    public static final String PASSWORD_FEED = SECURE_PASSWORD_BASE + "/feed";
    public static final String PASSWORD_DELETED_FEED = SECURE_PASSWORD_BASE + "/deleted/feed";

    // Account
    public static final String ACCOUNT_PATH = SECURE_BASE + "/account";
    public static final String ACCOUNT_KEY_DATA_PATH = ACCOUNT_PATH + "/data/key";

    // Billing
    public static final String BILLING_PATH = ACCOUNT_PATH + "/billing";
    public static final String BILLING_LICENSE_PATH = BILLING_PATH + "/licenses";
    public static final String BILLING_LICENSE_ADD = BILLING_LICENSE_PATH + "/add";
    public static final String BILLING_LICENSE_LIST = BILLING_LICENSE_PATH + "/list";
    public static final String BILLING_SUBSCRIPTION_SUMMARY = BILLING_PATH + "/subscription/summary";

    // Organization
    public static final String ORGANIZATION_PATH = SECURE_BASE + "/organization";
    public static final String ORGANIZATION_PUBLIC_KEYS = ORGANIZATION_PATH + "/publicKeys";
    @Deprecated
    public static final String ORGANIZATION_LICENSES = ORGANIZATION_PATH + "/licenses";
    public static final String ORGANIZATION_INVITE_USERS = ORGANIZATION_PATH + "/invite/users";
    public static final String ORGANIZATION_INVITE_RESEND = ORGANIZATION_PATH + "/invite/resend";
    public static final String ORGANIZATION_INVITE_CANCEL = ORGANIZATION_PATH + "/invite/cancel";
    public static final String ORGANIZATION_LICENSE_REMOVE = ORGANIZATION_PATH + "/license/remove";
    public static final String ORGANIZATION_REMOVE_VERIFIED_ACCOUNT_FROM_PLATFORM = ORGANIZATION_PATH + "/verifiedDomainMember/remove";

    // Password
    public static final String PASSWORD_PATH = SECURE_BASE + "/password";
    public static final String PASSWORD_PATH_V2 = SECURE_BASE_V2 + "/password";

    // Password Group
    public static final String PASSWORD_GROUP_DETAIL = PASSWORD_PATH + "/group/detail";
    public static final String PASSWORD_GROUP_CREATE = PASSWORD_PATH_V2 + "/group/create";
    public static final String PASSWORD_GROUP_DELETE = PASSWORD_PATH + "/group/delete";
    public static final String PASSWORD_GROUP_MANAGE_MEMBERSHIP = PASSWORD_PATH + "/group/manageTeamMembership";
    public static final String PASSWORD_GROUP_LIST = PASSWORD_PATH + "/group/list";
    public static final String PASSWORD_GROUP_INITIALIZATION_STATUS = PASSWORD_PATH + "/group/status";
    public static final String PASSWORD_GROUP_REMOVE_MEMBER = PASSWORD_PATH + "/group/member/remove";
}
