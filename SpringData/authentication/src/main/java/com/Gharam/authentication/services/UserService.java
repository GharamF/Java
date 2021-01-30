package com.Gharam.authentication.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.Gharam.authentication.models.User;
import com.Gharam.authentication.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public User RegisterUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return userRepository.save(user);
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User FindByUserID(Long id) {
		Optional<User> user = userRepository.findById(id);
		
		if(user.isPresent()) {
			return user.get();
		}else {
			return null;
		}
	}
	
	public boolean authenticateUser(String Email, String Pass) {
		User user = userRepository.findByEmail(Email);
		if (user == null) {
			return false;
		}else {
			if (BCrypt.checkpw(Pass, user.getPassword())) {
				return true;
			}else {
				return false ;
			}
		}
	} 
	
}
