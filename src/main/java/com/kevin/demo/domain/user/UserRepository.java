package com.kevin.demo.domain.user;

import com.kevin.demo.domain.Repository;

import java.util.List;

public interface UserRepository extends Repository<User> {
    User selectByMobile(String mobile);
    List<User> creditRank();
}
