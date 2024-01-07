package com.sqli.pbousquet.hello.producer;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;


import com.sqli.pbousquet.hello.model.*;


/**
 * 
 */
@Component
@jakarta.annotation.Generated(value = "io.zenwave360.sdk.plugins.SpringCloudStreams3Plugin", date = "2024-01-05T10:26:55.316980359+01:00")
public class DefaultServiceEventsProducer implements IDefaultServiceEventsProducer {

    protected Logger log = LoggerFactory.getLogger(getClass());

    protected StreamBridge streamBridge;
    public String sendHelloMessageBindingName = "send-hello-message-out-0";

    public java.util.function.Supplier<String> tracingIdSupplier;

    @org.springframework.beans.factory.annotation.Autowired(required = false)
    @org.springframework.beans.factory.annotation.Qualifier("tracingIdSupplier")
    public void setTracingIdSupplier(java.util.function.Supplier<String> tracingIdSupplier) {
        this.tracingIdSupplier = tracingIdSupplier;
    }


    public DefaultServiceEventsProducer(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }
    
    /**
     * 
     */
    public boolean sendHelloMessage(HelloMessagePayload payload, HelloMessagePayloadHeaders headers) {
        log.debug("Sending message to topic: {}", sendHelloMessageBindingName);
        Message message = MessageBuilder.createMessage(payload, new MessageHeaders(headers));
        return streamBridge.send(sendHelloMessageBindingName, message);
    }

    





}
