package com.lhl.springmvc.service.person.impl;

import com.lhl.springmvc.service.person.IPersonService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2016/5/9.
 */
public abstract class AbstractPersonImpl implements IPersonService {
    public Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("test1", "test1");
        map.put("test2", "test2");
        map.put("test3", "test3");
        return map;
    }

    public abstract Map<String, String> getOtherMap();
}
