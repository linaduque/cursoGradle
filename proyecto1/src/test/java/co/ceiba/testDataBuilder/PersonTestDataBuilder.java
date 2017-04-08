package co.ceiba.testDataBuilder;

import co.ceiba.domain.Person;

public class PersonTestDataBuilder {
	
	private String name;
	private String lastName;
	
	public PersonTestDataBuilder() {
		this.name = "Ceiba";
		this.lastName = "Software House";
	}
	
	
	public PersonTestDataBuilder withtName(String Name){
		this.name = Name;
		return this;
	}
	
	public PersonTestDataBuilder withtLastName(String lastName){
		this.name = lastName;
		return this;
	}
	
	 public Person build(){
		 return new Person(this.name, this.lastName);
		 }
	

}
