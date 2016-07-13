package com.example.spring.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;

@Component
@Scope(value=BeanDefinition.SCOPE_SINGLETON)
public class UserRepositoryImpl implements UserRepository {

	private List<User> users=new ArrayList<>();

	@Override
	public List<User> list() {
		return users;
	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}

	@Override
	public void save(User user) {
		users.add(user);
	}
	
	@Override
	public void displayList() {
		for (User user : users) {
			System.out.println("id: " + user.getId() + " name: " + user.getFirstName() + " " + user.getLastName()
					+ " age: " + user.getAge());
		}
		System.out.println("End of list");
	}

}
