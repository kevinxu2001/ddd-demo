package com.kevin.demo.service.impl;

import com.kevin.demo.domain.credit.CreditRepository;
import com.kevin.demo.domain.user.User;
import com.kevin.demo.domain.user.UserRepository;
import com.kevin.demo.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperatorServiceImpl implements OperatorService {

    @Autowired
    private CreditRepository creditRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> creditRank() {

        return userRepository.creditRank();
    }
}
