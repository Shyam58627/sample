package com.onlinetutorialspoint.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/javainuse-kafka/")
public class HelloController {

    @Autowired
    KafkaTemplate<String,String> KafkaTemplate;
  
   @GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
  
        
        KafkaTemplate.send(TOPIC_NAME,data1);
         }
        
        return data1;
    }
}

