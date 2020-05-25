package com.kevin.demo.service.impl;

import com.kevin.demo.BusinessException;
import com.kevin.demo.domain.credit.Credit;
import com.kevin.demo.domain.credit.CreditAction;
import com.kevin.demo.domain.user.User;
import com.kevin.demo.domain.user.UserFactory;
import com.kevin.demo.domain.user.UserRepository;
import com.kevin.demo.infrastructure.mapper.UserMapper;
import com.kevin.demo.service.AppExceptionMessage;
import com.kevin.demo.service.CreditService;
import com.kevin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CreditService creditService;


    @Override
    public List<User> userList() {
        List<User> userList = userRepository.selectAll();
        return userList;
    }

    @Override
    public User register(String mobile, String userName) {
        User checkRs = userRepository.selectByMobile(mobile);
        if (checkRs != null){
            BusinessException.throwException(AppExceptionMessage.MOBILE_EXIST_CODE, AppExceptionMessage.MOBILE_EXIST, mobile);
        }

        User user = UserFactory.createUser(mobile, userName);

        userRepository.insert(user);

        int userId = user.getId();
        creditService.addCredit(userId, CreditAction.REGISTER.getCode());

        return userRepository.selectByPrimaryKey(user.getId());
    }

    @Override
    public User get(int id) {
        User user = userRepository.selectByPrimaryKey(id);

        if(user == null){
            BusinessException.throwException(AppExceptionMessage.USER_NOT_EXIST_CODE, AppExceptionMessage.USER_NOT_EXIST, id);
        }

        return user;
    }
}
