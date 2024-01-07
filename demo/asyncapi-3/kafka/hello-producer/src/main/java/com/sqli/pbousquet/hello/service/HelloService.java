package com.sqli.pbousquet.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.sqli.pbousquet.hello.producer.IDefaultServiceEventsProducer;
import com.sqli.pbousquet.hello.model.HelloMessagePayload;
@Component
public class HelloService {
    
    @Autowired
    IDefaultServiceEventsProducer service;

    @Scheduled(fixedRate = 5000)
    public void sendHelloMessage() {
        HelloMessagePayload helloMessage = new HelloMessagePayload();
        helloMessage.setMessage("Hello fifi");
        service.sendHelloMessage(helloMessage, null);
    }
}
