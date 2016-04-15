package com.lhl.springmvc.dao;

import com.lhl.springmvc.AbstractControllerTests;
import com.lhl.springmvc.dao.user.UserMapper;
import com.lhl.springmvc.entity.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lenovo on 2016/4/15.
 */
public class UserDaoTest extends AbstractControllerTests {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserDao() {
        User user = userMapper.selectByPrimaryKey(1l);
        logger.info(user.getName());
    }
}
