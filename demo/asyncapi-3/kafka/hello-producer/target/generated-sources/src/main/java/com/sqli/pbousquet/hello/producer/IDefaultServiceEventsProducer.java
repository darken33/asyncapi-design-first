package com.sqli.pbousquet.hello.producer;


import com.sqli.pbousquet.hello.model.*;


/**
 * 
 */
@jakarta.annotation.Generated(value = "io.zenwave360.sdk.plugins.SpringCloudStreams3Plugin", date = "2024-01-04T07:41:23.145194418+01:00")
public interface IDefaultServiceEventsProducer {


    
    /**
     * 
     */
    boolean sendHelloMessage(HelloMessagePayload payload, HelloMessagePayloadHeaders headers);
    default boolean sendHelloMessage(HelloMessagePayload payload) {
        return sendHelloMessage(payload, null);
    };
    



    static class HelloMessagePayloadHeaders extends java.util.HashMap<String, Object> {
        public HelloMessagePayloadHeaders set(String header, Object value) {
            put(header, value);
            return this;
        }
    }


}
