package com.example.demo.service;
//사용자 데이터베이스에 저장된 사용자를 가져올떄 사용
import com.example.demo.model.UserEntity;
import com.example.demo.persistence.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j //로그라이브러리, 로그계의 JPA
@Service

public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public UserEntity create(final UserEntity userEntity) {
		if(userEntity == null || userEntity.getEmail() == null ) {
			throw new RuntimeException("Invalid argumnets");
		}
		final String email = userEntity.getEmail();
		if(userRepository.existsByEmail(email)) {
			log.warn("Email already exists {}",email);
			throw new RuntimeException("Email already exists");
		}
		return userRepository.save(userEntity);
	}
	
	public UserEntity getByCredentials(final String email, final String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}

}
