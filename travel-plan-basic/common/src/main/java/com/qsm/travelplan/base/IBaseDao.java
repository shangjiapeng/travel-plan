package com.qsm.travelplan.base;

import java.util.List;

/**
 * @Author: shangjp
 * @Email: shangjp@163.com
 * @Date: 2020/6/2 14:20
 * @Description:  BaseDao
 */
public interface IBaseDao<T> {

    int deleteByPrimaryKey(Long id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);

    List<T> list();
}
