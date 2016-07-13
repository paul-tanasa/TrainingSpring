package com.example.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;

@Service("UserServiceImpl")
@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public List<User> list() {
		//call method from UserRepository and remove throw
		return this.userRepo.list();
	}

	@Override
	public User get(int id) {
		//call method from UserRepository and remove throw
		return this.userRepo.get(id);
	}

	@Override
	public void save(User user) {
		//call method from UserRepository and remove throw
		this.userRepo.save(user);
	}
	
	@Override
	public void displayList(){
		userRepo.displayList();
	}
}
