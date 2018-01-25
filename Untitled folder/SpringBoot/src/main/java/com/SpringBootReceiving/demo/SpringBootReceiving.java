package com.SpringBootReceiving.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootSender.demo.SpringBootSender;

@RestController
@RequestMapping(value = "/SpringBoot with Kafka-kafka/")

public class SpringBootReceiving {
	@Autowired
	SpringBootSender kafkaSender;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);

		return "Message sent to the Kafka is done Successfully";
	
}
}
