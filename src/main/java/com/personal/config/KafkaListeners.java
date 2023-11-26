package com.personal.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "demotopic", groupId = "groupId")
    void listener(String Data){
        System.out.println(" Listner Recieved " + Data);
    }
}
