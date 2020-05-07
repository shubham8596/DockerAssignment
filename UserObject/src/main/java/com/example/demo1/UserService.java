package com.example.demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userrepository;
	
	//@Autowired 
	ResponseMessage response = new ResponseMessage();
	
	public List<User> getAllUser() {
		
		return userrepository.findAll(); 
	}
	

	public User getUser(long id) {
		return userrepository.getOne(id);
	}
	
		
	public ResponseMessage addUser(User topic)
	{
		userrepository.save(topic);
		response.setResponse("User added successfully");
		return response;
	}
	
	public ResponseMessage updateUser(long id, User topic)
	{
		userrepository.save(topic);
		response.setResponse("User Updated successfully");
		return response;
	}

	public ResponseMessage delete(long id) {
		userrepository.deleteById(id);
		response.setResponse("User Deleted successfully");
		return response;
		
	}

}
