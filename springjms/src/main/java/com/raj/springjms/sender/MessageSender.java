package com.raj.springjms.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value("${springjms.queue}")
	private String queue;
	
	public void send (String message) {
		System.err.println("Message Sending.....");
		jmsTemplate.convertAndSend(queue, message);
	}

}
