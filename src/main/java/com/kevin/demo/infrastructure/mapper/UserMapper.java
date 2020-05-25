package com.kevin.demo.infrastructure.mapper;

import com.kevin.demo.domain.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    User selectByMobile(String mobile);

    List<User> creditRank();

}
