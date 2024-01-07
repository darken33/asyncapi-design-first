package com.sqli.pbousquet.hello.producer;

@jakarta.annotation.Generated(value = "io.zenwave360.sdk.plugins.SpringCloudStreams3Plugin", date = "2024-01-04T07:41:23.168358465+01:00")
public class ProducerInMemoryContext {

    public static final ProducerInMemoryContext INSTANCE = new ProducerInMemoryContext();


    private DefaultServiceEventsProducerCaptor defaultServiceEventsProducerCaptor = new DefaultServiceEventsProducerCaptor();

    public <T extends IDefaultServiceEventsProducer> T defaultServiceEventsProducer() {
        return (T) defaultServiceEventsProducerCaptor;
    }

}
