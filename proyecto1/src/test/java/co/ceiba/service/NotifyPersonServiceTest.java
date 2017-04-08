package co.ceiba.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import co.ceiba.domain.Person;
import co.ceiba.testDataBuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {
	private NotifyPersonServiced notifyPersonService;
	private EmailService emailService;
	
	
	@Before
	public void setup(){
	emailService = new EmailService();
	notifyPersonService = new NotifyPersonServiced(emailService);
	}
	
	@Test
	public void notifyTest(){
		//Arrange
		Person person = new PersonTestDataBuilder().build();
		//Act
		String message = notifyPersonService.notify(person);
		//Assert
		Assert.assertNotNull(message);
	}
	

}
