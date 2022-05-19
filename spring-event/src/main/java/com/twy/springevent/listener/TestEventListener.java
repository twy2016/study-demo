package com.twy.springevent.listener;

import com.twy.springevent.event.TestEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author gongpeng
 * @date 2022/5/19 17:19
 */
@Component
@Slf4j
public class TestEventListener {

    @Async
    @EventListener
    public void listener(TestEvent event) throws InterruptedException {
        Thread.sleep(2000);
        log.info("监听到数据：{}", event.getMessage());
    }
}
