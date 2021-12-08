package com.fedex.location.utils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderImpl implements EmailSender {
	@Autowired
	private JavaMailSender sender;

	@Override
	public void sendEmail(String toaddress, String sub, String body) {

		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		try {
			helper.setTo(toaddress);
			helper.setSubject(sub);
			helper.setText(body);
		} catch (MessagingException e) {
			e.printStackTrace();
		}

		sender.send(message);

		// Create message (createMimeMessage)-> Helper class helps to set our values ->
		//create send (send)

	}

}
