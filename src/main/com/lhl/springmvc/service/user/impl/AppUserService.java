package com.lhl.springmvc.service.user.impl;

import com.lhl.springmvc.dao.user.UserMapper;
import com.lhl.springmvc.entity.User;
import com.lhl.springmvc.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2016/4/13.
 * app用户服务
 */
@Service("appUserService")
public class AppUserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 得到用户.
     *
     * @param id 用户ID
     * @return 返回用户UserDao
     */
    @Override
    public User getUser(long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
