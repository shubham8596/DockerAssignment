package com.example.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Long>{


	//Topic findByTopic(String s);

}
