package com.sqli.pbousquet.hello.producer;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;


import com.sqli.pbousquet.hello.model.*;


/**
 * 
 */
@jakarta.annotation.Generated(value = "io.zenwave360.sdk.plugins.SpringCloudStreams3Plugin", date = "2024-01-04T07:41:23.164517863+01:00")
public class DefaultServiceEventsProducerCaptor implements IDefaultServiceEventsProducer {

    protected Logger log = LoggerFactory.getLogger(getClass());
    public String sendHelloMessageBindingName = "send-hello-message-out-0";

    public java.util.function.Supplier<String> tracingIdSupplier;

    @org.springframework.beans.factory.annotation.Autowired(required = false)
    @org.springframework.beans.factory.annotation.Qualifier("tracingIdSupplier")
    public void setTracingIdSupplier(java.util.function.Supplier<String> tracingIdSupplier) {
        this.tracingIdSupplier = tracingIdSupplier;
    }


    protected Map<String, List<Message>> capturedMessages = new HashMap<>();
    public Map<String, List<Message>> getCapturedMessages() {
        return capturedMessages;
    }
    public List<Message> getCapturedMessages(String bindingName) {
        return capturedMessages.getOrDefault(bindingName, new ArrayList<>());
    }
    private boolean appendCapturedMessage(String bindingName, Message message) {
        if(capturedMessages.containsKey(bindingName)) {
            capturedMessages.get(bindingName).add(message);
        } else {
            capturedMessages.put(bindingName, new ArrayList<>(List.of(message)));
        }
        return true;
    }
    
    /**
     * 
     */
    public boolean sendHelloMessage(HelloMessagePayload payload, HelloMessagePayloadHeaders headers) {
        log.debug("Capturing message to topic: {}", sendHelloMessageBindingName);
        Message message = MessageBuilder.createMessage(payload, new MessageHeaders(headers));
        return appendCapturedMessage(sendHelloMessageBindingName, message);
    }

    


}
