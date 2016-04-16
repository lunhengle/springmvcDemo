package com.lhl.springmvc.service.user.impl;

import com.lhl.springmvc.dao.user.UserMapper;
import com.lhl.springmvc.entity.User;
import com.lhl.springmvc.service.user.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2016/4/12.
 * 默认的用户服务
 */
@Service("defaultUserService")
public class DefaultUserService implements IUserService {
    private  Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 得到用户.
     *
     * @param id 用户ID
     * @return 返回用户UserDao
     */
    @Override
    public User getUser(long id) {
      List<Map<String, Object>> list=jdbcTemplate.queryForList("select name from user where id="+id+"");
        logger.info(String.valueOf(list.get(0).get("name")));
        return new User();
       /* return userMapper.selectByPrimaryKey(id);*/
    }
}
