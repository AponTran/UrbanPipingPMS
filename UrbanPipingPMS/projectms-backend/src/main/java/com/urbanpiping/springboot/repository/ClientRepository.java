package com.urbanpiping.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbanpiping.springboot.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
