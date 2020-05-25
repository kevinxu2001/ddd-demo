package com.kevin.demo.controller;

import com.kevin.demo.domain.credit.Credit;
import com.kevin.demo.domain.user.User;
import com.kevin.demo.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/opt")
public class OperatorController {
    @Autowired
    private OperatorService operatorService;


    @RequestMapping(value = "creditRank")
    public ResultMessage creditRank(){
        List<User> creditRank = operatorService.creditRank();
        return ResultMessage.success(creditRank);
    }
}
