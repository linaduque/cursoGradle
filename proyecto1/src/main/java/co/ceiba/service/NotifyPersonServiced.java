package co.ceiba.service;

import co.ceiba.domain.Person;

public class NotifyPersonServiced {

	private EmailService emailService;

	public NotifyPersonServiced(EmailService emailService) {
		
		this.emailService = emailService;
	}
	
	public String notify(Person person){
		String message = "Welcome " + person.getName();
		
		return emailService.sendMail(message);
	}
	
	
	
	

}
