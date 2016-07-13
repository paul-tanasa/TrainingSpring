package com.example.spring.domain;

import org.springframework.stereotype.Component;

@Component
public class User {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	
	public User(){
		this.setId(-1);
		this.setFirstName("Unknown");
		this.setLastName("Unknown");
	}
	
	public User(Integer id, String firstName, String lastName, Integer age){
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
