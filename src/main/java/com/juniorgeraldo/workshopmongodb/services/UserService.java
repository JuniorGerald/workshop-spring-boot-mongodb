package com.juniorgeraldo.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juniorgeraldo.workshopmongodb.domain.User;
import com.juniorgeraldo.workshopmongodb.dto.UserDTO;
import com.juniorgeraldo.workshopmongodb.repository.UserRepository;
import com.juniorgeraldo.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo; //injeção de dependência automática do spring, com o autowired ele busca o objeto pra instanciar e faz a injeção
	
	public List<User> findAll(){
		return repo.findAll();	
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}

}
