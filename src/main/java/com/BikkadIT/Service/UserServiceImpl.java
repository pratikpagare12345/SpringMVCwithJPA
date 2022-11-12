package com.BikkadIT.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Repository.UserRepository;
import com.BikkadIT.model.User;

@Service 
public class UserServiceImpl  implements UserServiceI{

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {

		User user1 = userRepository.save(user);
		
		
		
		return user1;
	}
	
	
	

}
