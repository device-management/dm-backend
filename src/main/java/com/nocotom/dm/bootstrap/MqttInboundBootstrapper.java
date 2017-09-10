package com.nocotom.dm.bootstrap;

import com.nocotom.dm.configuration.MqttBrokerProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

@Configuration
public class MqttInboundBootstrapper {

    private final MqttBrokerProperties brokerProperties;

    public MqttInboundBootstrapper(MqttBrokerProperties brokerProperties) {
        this.brokerProperties = brokerProperties;
    }
/*
    @Bean
    public MessageChannel mqttInputChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageProducer inbound() {
        MqttPahoMessageDrivenChannelAdapter adapter =
                new MqttPahoMessageDrivenChannelAdapter(brokerProperties.getUri(), brokerProperties.getUserName(),
                        brokerProperties.getSubscribeTopics());
        adapter.setCompletionTimeout(5000);
        adapter.setConverter(new DefaultPahoMessageConverter());
        adapter.setQos(1);
        adapter.setOutputChannel(mqttInputChannel());
        return adapter;
    }

    @Bean
    @ServiceActivator(inputChannel = "mqttInputChannel")
    public MessageHandler handler(ConfigurableApplicationContext context) {
        return message -> {
            MqttBootstrapper.MyGateway gateway = context.getBean(MqttBootstrapper.MyGateway.class);
            System.out.println(message.getPayload());
            gateway.sendToMqtt("Hello client!");
        };
    }

*/
}