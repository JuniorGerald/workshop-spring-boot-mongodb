package com.juniorgeraldo.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juniorgeraldo.workshopmongodb.domain.Post;
import com.juniorgeraldo.workshopmongodb.repository.PostRepository;
import com.juniorgeraldo.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo; //injeção de dependência automática do spring, com o autowired ele busca o objeto pra instanciar e faz a injeção
	
/*	public List<Post> findAll(){
		return repo.findAll();	
	}*/
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}

	public List<Post> findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}
}
