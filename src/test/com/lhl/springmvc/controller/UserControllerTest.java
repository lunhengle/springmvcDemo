package com.lhl.springmvc.controller;

import com.lhl.springmvc.AbstractControllerTests;
import com.lhl.springmvc.controller.user.DefaultUserController;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by lenovo on 2016/4/13.
 * 用户 controller 测试类
 */
public class UserControllerTest extends AbstractControllerTests {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private DefaultUserController defaultUserController;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(defaultUserController).build();
    }

    /**
     * 测试字符串.
     *
     * @throws Exception
     */
    @Test
    public void testStringDefaultUserController() throws Exception {
        this.mockMvc.perform(
                post("/lhl/user/getUser.do").characterEncoding("UTF-8")
        ).andExpect(MockMvcResultMatchers.model().attribute("message", "message")).andDo(print());
    }

    /**
     * 测试json 字符串
     */
    @Test
    public void testJsonDefaultUserController() throws Exception {
        this.mockMvc.perform(post("/lhl/user/getJsonUser.do").characterEncoding("UTF-8").contentType(MediaType.APPLICATION_JSON_UTF8))
                .andDo(print())//打印数据
                .andExpect(status().isOk())//判断是否返回值是否是200
                .andExpect(status().is(200))//判断是否返回值是否是200 另一种方式
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))//判断返回类型是json utf-8
                .andExpect(jsonPath("$.id").isNumber())//判断是否是int long double类型
                .andExpect(jsonPath("$.id").exists())//判断id 是否存在
                .andExpect(jsonPath("$.id").isNotEmpty())//判断id 是否为空
                .andExpect(jsonPath("$.id", is(1)))//判断id的值是否是1
                .andExpect(jsonPath("$.fid").doesNotExist())//判断不存在
                .andExpect(jsonPath("$.name").isString())//判断是否是字符串
                .andExpect(jsonPath("$.name").value("lunhengle"))//判断name的值是否是 伦恒乐默认
                .andExpect(jsonPath("$.password").isString())//判断是否是字符串
                .andExpect(jsonPath("$.password", is("123456")));//判断password的值是否是 123456 字符串
    }
    /**
     * 测试带参数的json
     */
    @Test
    public void testJsonParamsDefaultUserController() throws Exception {
        this.mockMvc.perform(post("/lhl/user/getJsonUserParams.do").param("id","1").characterEncoding("UTF-8").contentType(MediaType.APPLICATION_JSON_UTF8))
                .andDo(print())//打印数据
                .andExpect(status().isOk())//判断是否返回值是否是200
                .andExpect(status().is(200))//判断是否返回值是否是200 另一种方式
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))//判断返回类型是json utf-8
                .andExpect(jsonPath("$.id").isNumber())//判断是否是int long double类型
                .andExpect(jsonPath("$.id").exists())//判断id 是否存在
                .andExpect(jsonPath("$.id").isNotEmpty())//判断id 是否为空
                .andExpect(jsonPath("$.id", is(1)))//判断id的值是否是1
                .andExpect(jsonPath("$.fid").doesNotExist())//判断不存在
                .andExpect(jsonPath("$.name").isString())//判断是否是字符串
                .andExpect(jsonPath("$.name").value("lunhengle"))//判断name的值是否是 伦恒乐默认
                .andExpect(jsonPath("$.password").isString())//判断是否是字符串
                .andExpect(jsonPath("$.password", is("123456")));//判断password的值是否是 123456 字符串
    }
}
