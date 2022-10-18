package com.gaurav.microservices.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gaurav.microservices.demo.dto.Department;
import com.gaurav.microservices.demo.dto.ResponseTemplate;
import com.gaurav.microservices.demo.entities.User;
import com.gaurav.microservices.demo.repositories.UserRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	//department-service represents hostname:port
	private final String DEPARTMENT_SERVICE_URL = "http://DEPARTMENT-SERVICE/departments/";
	@Autowired UserRepository userRepository;
	@Autowired RestTemplate restTemplate;
	
	@PostMapping("")
	public User saveUser(@RequestBody User user) {
		log.info("saving user");
		return userRepository.save(user);
	}
	
	//get UserAndDepartment by user id
	@GetMapping("/{id}")
	public ResponseTemplate getResponseTemplate(@PathVariable("id") Long userId) {
		log.info("finding user");
		User user = userRepository.findById(userId).get();
		log.info("getting department from department-service");
		Department department = restTemplate.getForObject( DEPARTMENT_SERVICE_URL +user.getDepartmentId(), Department.class);
		log.info("returning response template");
		return new ResponseTemplate(user,department);
	}
	
}
