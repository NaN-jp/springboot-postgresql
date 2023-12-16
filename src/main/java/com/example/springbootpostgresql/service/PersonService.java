package com.example.springbootpostgresql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springbootpostgresql.model.Person;
import com.example.springbootpostgresql.repository.PersonRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public Person insert(Person person){
        return repository.save(person);
    }

    public List<Person> findPerson(){
        return repository.findAll();
    }
    public int findAgePerson(Integer id){
        return repository.getReferenceById(id).getAge();
    }
}
