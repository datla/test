package com.test.service;

import com.test.model.Person;

import java.util.List;

public interface PersonService {

    public void addPerson(Person person);

    public List<Person> getAllPeople();
}
