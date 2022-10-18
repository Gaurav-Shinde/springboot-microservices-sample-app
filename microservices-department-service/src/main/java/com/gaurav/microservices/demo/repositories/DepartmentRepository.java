package com.gaurav.microservices.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.microservices.demo.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
