package com.qsm.travelplan.mapper;

import com.qsm.travelplan.base.IBaseDao;
import com.qsm.travelplan.entity.User;

import java.util.List;

public interface UserMapper extends IBaseDao<User> {

    List<User> list();
}