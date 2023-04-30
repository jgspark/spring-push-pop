package com.example.consumer.infra.config.sqs;

import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AwsSQSListener {

    @SqsListener(value = "sample-queue1.fifo")
    public void testSqsListener(String snsMessage) {
        log.info("sqs message : {}", snsMessage);
    }
}
