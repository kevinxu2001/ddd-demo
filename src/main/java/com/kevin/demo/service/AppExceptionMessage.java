package com.kevin.demo.service;

public class AppExceptionMessage {
    public static int APP_EXCEPTION_CODE = 20000;

    public static int MOBILE_EXIST_CODE = APP_EXCEPTION_CODE++;
    public static final String MOBILE_EXIST = "Mobile Phone number has existed！ {0}。";

    public static int USER_NOT_EXIST_CODE = APP_EXCEPTION_CODE++;
    public static final String USER_NOT_EXIST = "User does not exist！ {0}。";

    public static int CREDIT_ACTION_NOT_EXIST_CODE = APP_EXCEPTION_CODE++;
    public static final String CREDIT_ACTION_NOT_EXIST = "Action code not exist！ {0}。";

}