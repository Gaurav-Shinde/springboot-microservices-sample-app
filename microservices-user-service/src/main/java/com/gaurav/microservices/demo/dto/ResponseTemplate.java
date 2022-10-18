package com.gaurav.microservices.demo.dto;

import com.gaurav.microservices.demo.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {

	private User user;
	private Department department;
}
