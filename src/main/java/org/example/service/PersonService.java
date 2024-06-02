package org.example.service;

import org.example.models.Person;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PersonService {
    @Transactional(readOnly = true)
    List<Person> index();
    @Transactional(readOnly = true)
    Person show(int id);
    @Transactional
    void save(Person person);
    @Transactional
    void update(int id, Person updatedPerson);
    @Transactional
    void deleteUser(int id);
}
