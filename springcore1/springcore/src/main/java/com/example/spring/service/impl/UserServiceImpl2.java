package com.example.spring.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;

@Service("UserServiceImpl2")
@Component
public class UserServiceImpl2 implements UserService,ApplicationContextAware {
	
	private ApplicationContext appContext;
	
	
	@Override
	public List<User> list() {
		UserRepository userRepo=appContext.getBean(UserRepository.class);
		return userRepo.list();
	}

	@Override
	public User get(int id) {
		//call method from UserRepository and remove throw
		UserRepository userRepo=appContext.getBean(UserRepository.class);
		return userRepo.get(id);
	}

	@Override
	public void save(User user) {
		//call method from UserRepository and remove throw
		UserRepository userRepo=appContext.getBean(UserRepository.class);
		userRepo.save(user);
	}
	
	@Override
	public void displayList(){
		UserRepository userRepo=appContext.getBean(UserRepository.class);
		userRepo.displayList();
		System.out.println("Impl2");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext context){
		this.appContext=context;
	}
}

