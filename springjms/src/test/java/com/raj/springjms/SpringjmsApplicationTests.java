package com.raj.springjms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.raj.springjms.sender.MessageSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringjmsApplicationTests {

	@Autowired
	public MessageSender messageSender;
	
	@Test
	public void sendMessage() {
		System.err.println("messageSender is :: " + messageSender);
		messageSender.send("Hello ActiveMQ.. My First Message");
	}

}
