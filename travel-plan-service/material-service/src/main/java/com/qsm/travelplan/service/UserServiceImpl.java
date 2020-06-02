package com.qsm.travelplan.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.qsm.travelplan.api.IUserService;
import com.qsm.travelplan.base.BaseServiceImpl;
import com.qsm.travelplan.base.IBaseDao;
import com.qsm.travelplan.entity.User;
import com.qsm.travelplan.mapper.UserMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: shangjp
 * @Email: shangjp@163.com
 * @Date: 2020/6/2 18:25
 * @Description:
 */
@Service
@Component
public class UserServiceImpl extends BaseServiceImpl<User>implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public IBaseDao<User> getBaseDao() {
        return userMapper;
    }


}
