package com.twy.springevent.controller;

import com.twy.springevent.publish.TestPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gongpeng
 * @date 2022/5/19 17:27
 */
@RestController
public class TestController {

    @Autowired
    private TestPublisher publishEvent;

    @RequestMapping("publish")
    public void publish() {
        for (int i = 0; i < 5; i++) {
            publishEvent.publish("你若为我繁华，你好呀：" + (i + 1));
        }
    }
}
