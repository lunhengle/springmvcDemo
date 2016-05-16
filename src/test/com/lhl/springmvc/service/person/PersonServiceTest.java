package com.lhl.springmvc.service.person;

import com.lhl.springmvc.AbstractControllerTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by lenovo on 2016/5/9.
 */
public class PersonServiceTest extends AbstractControllerTests {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private IPersonService appPersonImpl;

    @Autowired
    private IPersonService wwwPersonImpl;

    @Test
    public void testMap() {
        Map<String, String> appmap = appPersonImpl.getMap();
        for (Map.Entry entry : appmap.entrySet()) {
            logger.info(" key=" + entry.getKey().toString() + " value=" + entry.getValue().toString());
        }
        Map<String, String> appotherMap = appPersonImpl.getOtherMap();
        for (Map.Entry entry : appotherMap.entrySet()) {
            logger.info(" key=" + entry.getKey().toString() + " value=" + entry.getValue().toString());
        }

        Map<String, String> wwwmap = wwwPersonImpl.getMap();
        for (Map.Entry entry : wwwmap.entrySet()) {
            logger.info(" key=" + entry.getKey().toString() + " value=" + entry.getValue().toString());
        }
        Map<String, String> wwwotherMap = wwwPersonImpl.getOtherMap();
        for (Map.Entry entry : wwwotherMap.entrySet()) {
            logger.info(" key=" + entry.getKey().toString() + " value=" + entry.getValue().toString());
        }
    }


}
