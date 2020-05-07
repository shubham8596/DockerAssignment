package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserController {

	ObjectMapper mapper = new ObjectMapper();
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/user")
	public List<User> getAllUser(){
		return userservice.getAllUser();
	}
	
	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable int id){
		return userservice.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/user")
	public String addUser(@RequestBody User topic){
		String json=null;
		ResponseMessage response = userservice.addUser(topic);
		try {
			 json = mapper.writeValueAsString(response);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
		
	}

	@RequestMapping(method=RequestMethod.PUT, value="/user/{id}")
	public String updateUser(@RequestBody User topic, @PathVariable int id){
	
		String json=null;
		ResponseMessage response = userservice.updateUser(id, topic);
		try {
			 json = mapper.writeValueAsString(response);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/user/{id}")
	public String deleteUser(@PathVariable int id)
	{
		String json=null;
		ResponseMessage response = userservice.delete(id);
		try {
			 json = mapper.writeValueAsString(response);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
		
	}
}