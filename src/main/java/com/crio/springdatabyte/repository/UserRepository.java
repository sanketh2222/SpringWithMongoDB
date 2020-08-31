package com.crio.springdatabyte.repository;

import com.crio.springdatabyte.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends MongoRepository<User, Integer> {

}
