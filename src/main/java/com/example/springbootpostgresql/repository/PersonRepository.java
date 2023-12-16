package com.example.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootpostgresql.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    
}
