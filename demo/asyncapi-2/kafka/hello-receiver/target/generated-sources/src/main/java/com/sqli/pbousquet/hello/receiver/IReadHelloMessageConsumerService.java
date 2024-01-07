package com.sqli.pbousquet.hello.receiver;

import java.util.Map;

import com.sqli.pbousquet.hello.model.*;


/**
* 
*/
@jakarta.annotation.Generated(value = "io.zenwave360.sdk.plugins.SpringCloudStreams3Plugin", date = "2024-01-04T11:19:50.969800232+01:00")
public interface IReadHelloMessageConsumerService {


    /**
     * 
     */
    default void readHelloMessage(HelloMessagePayload payload, HelloMessagePayloadHeaders headers) {};

    static class HelloMessagePayloadHeaders extends java.util.HashMap<String, Object> {
        public HelloMessagePayloadHeaders set(String header, Object value) {
            put(header, value);
            return this;
        }
    }


}
