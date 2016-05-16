package com.lhl.springmvc.service.person.impl;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2016/5/9.
 */
@Service
public class AppPersonImpl extends AbstractPersonImpl {
    public Map<String, String> getOtherMap() {
        Map<String, String> map = new HashMap<>();
        map.put("apptest1", "apptest1");
        map.put("apptest2", "apptest2");
        map.put("apptest3", "apptest3");
        return map;
    }
}
