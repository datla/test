package com.test.service;

import com.test.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    protected List<Person> people = new ArrayList<Person>();

    public PersonServiceImpl(){
        people.add(new Person("Test", "User"));
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getAllPeople(){
        return people;
    }
}
