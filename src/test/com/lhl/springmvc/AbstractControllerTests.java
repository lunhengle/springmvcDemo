package com.lhl.springmvc;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by lenovo on 2016/4/13.
 */
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring/application_core.xml", "classpath:spring/application_mvc.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AbstractControllerTests {
    @Autowired
    protected WebApplicationContext wac;
}
