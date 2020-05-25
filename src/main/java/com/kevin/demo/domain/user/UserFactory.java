package com.kevin.demo.domain.user;

public class UserFactory {
    private UserFactory() {}

    public static User createUser(String mobile, String userName) {
        User user = new User();
        user.setMobile(mobile);
        user.setUserName(userName);

        return user;
    }
}
