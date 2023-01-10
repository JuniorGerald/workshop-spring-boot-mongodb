package com.juniorgeraldo.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juniorgeraldo.workshopmongodb.domain.User;
import com.juniorgeraldo.workshopmongodb.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo; //injeção de dependência automática do spring, com o autowired ele busca o objeto pra instanciar e faz a injeção
	
	public List<User> findAll(){
		return repo.findAll();	
	}

}
