package com.lhl.springmvc.service.user;

import com.lhl.springmvc.entity.User;

/**
 * Created by lenovo on 2016/4/13.
 */
public interface IUserService {
    /**
     * 得到用户.
     *
     * @param id 用户ID
     * @return 返回用户UserDao
     */
    User getUser(final long id);
}
