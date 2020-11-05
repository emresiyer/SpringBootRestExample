package com.emre.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emre.project.model.User;


public interface UserRepository extends CrudRepository<User,Integer> {

	
}
