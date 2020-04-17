package com.raj.springjms.listener;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
	
	@JmsListener(destination="${springjms.queue}")
	public void receive (String message) {
		System.err.println("Message Received by the Listener ==> " + message);
	}
}
