package com.lhl.springmvc.service.person.impl;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2016/5/9.
 */
@Service
public class WwwPersonImpl extends AbstractPersonImpl {
    public Map<String, String> getOtherMap() {
        Map<String, String> map = new HashMap<>();
        map.put("wwwtest1", "wwwtest1");
        map.put("wwwtest2", "wwwtest2");
        map.put("wwwtest3", "wwwtest3");
        return map;
    }
}
