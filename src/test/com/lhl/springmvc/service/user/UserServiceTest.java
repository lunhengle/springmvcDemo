package com.lhl.springmvc.service.user;


import com.lhl.springmvc.AbstractControllerTests;
import com.lhl.springmvc.entity.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 * Created by lenovo on 2016/4/13.
 * 用户 service 测试类
 */
public class UserServiceTest extends AbstractControllerTests {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("defaultUserService")
    private IUserService defaultUserService;

    @Autowired
    @Qualifier("appUserService")
    private IUserService appUserService;

    @Autowired
    private IUserService mailUserService;

    @Autowired
    private IUserService wwwUserService;

    @Autowired
    private IUserService u3dUserService;

    /**
     * 测试默认的用户service.
     */
    @Test
    public void testDefaultUserService() {
        User user = defaultUserService.getUser(1);
        logger.info(user.getName());
    }

    /**
     * 测试app用户service.
     */
    @Test
    public void testAppUserService() {
        User user = appUserService.getUser(1);
        logger.info(user.getName());
    }

    /**
     * 测试商城用户service.
     */
    @Test
    public void testMailUserService() {
        User user = mailUserService.getUser(1);
        logger.info(user.getName());
    }

    /**
     * 测试网站用户service.
     */
    @Test
    public void testWwwwUserService() {
        User user = wwwUserService.getUser(1);
        logger.info(user.getName());
    }

    /**
     * 测试u3d用户service.
     */
    @Test
    public void testU3dUserService() {
        User user = u3dUserService.getUser(1);
        logger.info(user.getName());
    }
}
