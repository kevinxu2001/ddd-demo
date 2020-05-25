package com.kevin.demo.infrastructure.repository;

import com.kevin.demo.domain.user.User;
import com.kevin.demo.domain.user.UserRepository;
import com.kevin.demo.infrastructure.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository
{
    private static final String CUSTOMER_TABLE = "user";

    @Autowired
    private UserMapper userMapper;


    @Override
    public void deleteByPrimaryKey(Integer id) {

    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public int insertSelective(User user) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKeySelective(User user) {

    }

    @Override
    public void updateByPrimaryKey(User user) {

    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User selectByMobile(String mobile) {
        return userMapper.selectByMobile(mobile);
    }

    @Override
    public List<User> creditRank() {
        return userMapper.creditRank();
    }
}
