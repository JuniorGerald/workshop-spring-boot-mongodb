package com.juniorgeraldo.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.juniorgeraldo.workshopmongodb.domain.Post;
import com.juniorgeraldo.workshopmongodb.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
