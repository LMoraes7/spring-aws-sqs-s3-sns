package com.github.lmoraes.spring.aws.sqs.listener;

import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public final class PrincipalListener {

    @SqsListener(value = "${spring.cloud.aws.queue.name}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void listener(String message) {
        System.out.println(message);
    }
}