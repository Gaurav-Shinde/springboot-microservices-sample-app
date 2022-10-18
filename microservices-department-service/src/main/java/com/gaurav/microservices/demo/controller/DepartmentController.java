package com.gaurav.microservices.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.microservices.demo.entities.Department;
import com.gaurav.microservices.demo.repositories.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired DepartmentRepository departmentRepository;
	
	//save
	@PostMapping("") //must be empty, otherwise path is /departments/
	public Department saveDepartment(@RequestBody Department department) {
		log.info("saving department...");
		return departmentRepository.save(department);
	}
	//get
	@GetMapping("/{id}")
	public Department getDepartment(@PathVariable Long id) {
		Optional<Department> departmentOptional = departmentRepository.findById(id);
		if(departmentOptional.isPresent()) {
			log.info("department found...");
			return departmentOptional.get();
		}
		return null;
		
	}
	
}
