package com.surya.userservice.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.surya.userservice.entities.UserInfoDto;
import com.surya.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceConsumer
{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @KafkaListener(topics = "${spring.kafka.topic-json.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(UserInfoDto eventData) {
        try{
            //TODO: Make it transactional, to handle idempotency and validate email, phoneNumber etc
//            userService.createOrUpdateUser(eventData);
            System.out.println("AuthServiceConsumer: Consumed event: " + eventData);
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("AuthServiceConsumer: Exception is thrown while consuming kafka event");
        }
    }

}
