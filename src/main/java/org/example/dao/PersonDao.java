package org.example.dao;

import org.example.models.Person;

import java.util.List;

public interface PersonDao {
    List<Person> index();
    Person show(int id);
    void save(Person person);
    void update(int id, Person updatedPerson);
    void deleteUser(int id);
}
