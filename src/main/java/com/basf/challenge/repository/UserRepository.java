package com.basf.challenge.repository;

import com.basf.challenge.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
	List<User> findByFirstName(String firstName);
	List<User> findByLastName(String lastName);

}
