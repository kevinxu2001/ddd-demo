package com.kevin.demo.controller;

import com.kevin.demo.domain.user.User;
import com.kevin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user") //, produces = "application/json;charset=utf-8")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public ResultMessage list(){
        List<User> list = userService.userList();
        return ResultMessage.success(list);
    }

    @RequestMapping("register")
    public ResultMessage register(@RequestParam(value = "mobile") String mobile, @RequestParam(value = "userName") String userName){
        User user =  userService.register(mobile, userName);
        return ResultMessage.success(user);
    }

    @RequestMapping("get")
    public ResultMessage register(@RequestParam(value = "id") Integer id){
        User user = userService.get(id);
        return ResultMessage.success(user);
    }
}
