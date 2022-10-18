package com.gaurav.microservices.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.microservices.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
