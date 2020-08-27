package com.crio.springdatabyte.repository;

import com.crio.springdatabyte.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {

}
