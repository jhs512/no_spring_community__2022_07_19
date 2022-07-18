package com.jhs.exam.exam2.util;

import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;

public class MailAuth extends Authenticator {

	PasswordAuthentication pa;

	public MailAuth(String mailId, String mailPw) {

		pa = new PasswordAuthentication(mailId, mailPw);
	}

	public PasswordAuthentication getPasswordAuthentication() {
		return pa;
	}
}