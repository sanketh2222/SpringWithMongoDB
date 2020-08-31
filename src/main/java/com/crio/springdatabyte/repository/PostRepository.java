package com.crio.springdatabyte.repository;

import com.crio.springdatabyte.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface PostRepository extends MongoRepository<Post, Integer> {

}
