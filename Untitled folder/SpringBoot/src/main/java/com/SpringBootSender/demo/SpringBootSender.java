package com.SpringBootSender.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SpringBootSender {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	String kafka = "SpringBoot with Kafka";
	
	public void send(String message) {
	    
	    kafkaTemplate.send(kafka, message);
	
	
	}
	

}
