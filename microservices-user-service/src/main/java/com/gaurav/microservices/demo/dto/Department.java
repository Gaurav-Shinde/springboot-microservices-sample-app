package com.gaurav.microservices.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Department {
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
}
