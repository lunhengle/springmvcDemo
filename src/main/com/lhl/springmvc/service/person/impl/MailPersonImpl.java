package com.lhl.springmvc.service.person.impl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2016/5/9.
 */
public class MailPersonImpl extends AbstractPersonImpl{
    public Map<String, String> getOtherMap() {
        Map<String, String> map = new HashMap<>();
        map.put("mailtest1", "mailtest1");
        map.put("mailtest2", "mailtest2");
        map.put("mailtest3", "mailtest3");
        return map;
    }
}
