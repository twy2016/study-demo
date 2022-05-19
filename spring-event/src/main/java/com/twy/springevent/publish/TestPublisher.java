package com.twy.springevent.publish;

import com.twy.springevent.event.TestEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author gongpeng
 * @date 2022/5/19 17:24
 */
@Component
public class TestPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publish(String message) {
        applicationEventPublisher.publishEvent(new TestEvent(message));
    }
}
