package com.qsm.travelplan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qsm.travelplan.api.IUserService;
import com.qsm.travelplan.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: shangjp
 * @Email: shangjp@163.com
 * @Date: 2020/6/2 22:51
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class UserController {

    @Reference
    private IUserService userService;


    @GetMapping("/list")
    public List<User> list(){
       return userService.list();
    }
}
