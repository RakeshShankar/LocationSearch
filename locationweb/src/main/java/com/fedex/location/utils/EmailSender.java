package com.fedex.location.utils;

public interface EmailSender {
	void sendEmail(String toaddress, String sub, String body);
}
