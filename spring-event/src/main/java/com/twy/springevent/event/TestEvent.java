package com.twy.springevent.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author gongpeng
 * @date 2022/5/19 17:15
 */
public class TestEvent extends ApplicationEvent {
    private String message;

    public TestEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public TestEvent(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
