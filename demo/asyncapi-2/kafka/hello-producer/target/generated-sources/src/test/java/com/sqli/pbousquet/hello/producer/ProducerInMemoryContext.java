package com.sqli.pbousquet.hello.producer;

@jakarta.annotation.Generated(value = "io.zenwave360.sdk.plugins.SpringCloudStreams3Plugin", date = "2024-01-05T10:26:55.334729107+01:00")
public class ProducerInMemoryContext {

    public static final ProducerInMemoryContext INSTANCE = new ProducerInMemoryContext();


    private DefaultServiceEventsProducerCaptor defaultServiceEventsProducerCaptor = new DefaultServiceEventsProducerCaptor();

    public <T extends IDefaultServiceEventsProducer> T defaultServiceEventsProducer() {
        return (T) defaultServiceEventsProducerCaptor;
    }

}
