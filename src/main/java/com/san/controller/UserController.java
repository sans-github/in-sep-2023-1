package com.san.controller;

import com.san.entity.User;
import com.san.repository.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	@ResponseBody
	public User getUser(@PathVariable int id) {
		return userService.getUser(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity deleteUser(@PathVariable int id){
		 userService.deleteUser(id);
		 return ResponseEntity.ok().build();
	}
}
