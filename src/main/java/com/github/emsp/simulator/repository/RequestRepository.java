package com.github.emsp.simulator.repository;

import org.springframework.stereotype.Repository;

import com.github.emsp.simulator.entity.Request;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RequestRepository extends JpaRepository<Request, String>{
    
}
