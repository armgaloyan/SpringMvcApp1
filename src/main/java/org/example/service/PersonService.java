package org.example.service;

import org.example.models.Person;

import java.util.List;

public interface PersonService {

    List<Person> index();

    Person show(int id);

    void save(Person person);

    void update(int id, Person updatedPerson);

    void deleteUser(int id);
}
