package com.example.zohocrm.utilies;

import org.springframework.stereotype.Component;

@Component
public interface EmailService {
	public void sendSimpleMessage(
		      String to, String subject, String text);

}
