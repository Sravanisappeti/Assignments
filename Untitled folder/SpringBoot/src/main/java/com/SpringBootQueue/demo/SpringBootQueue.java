package com.SpringBootQueue.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringBootSender.demo.SpringBootSender;
@SpringBootApplication
public class SpringBootQueue {
	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { SpringBootSender.class }, args);
	

}
}

