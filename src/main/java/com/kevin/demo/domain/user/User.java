package com.kevin.demo.domain.user;

import com.kevin.demo.domain.Entity;
import lombok.Data;

@Data
public class User implements Entity<User> {

    private int id;
    private String userName;
    /**
     * 性别
     */
    private int gender;
    private String mobile;

    private int totalCredit;


    @Override
    public boolean sameInentifyAs(User other) {
        return false;
    }
}
