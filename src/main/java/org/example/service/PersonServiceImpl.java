package org.example.service;

import org.example.dao.PersonDaoImpl;
import org.example.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonDaoImpl personDaoImpl;

    public PersonServiceImpl(PersonDaoImpl personDaoImpl) {
        this.personDaoImpl = personDaoImpl;
    }

    @Override
    public List<Person> index() {
        return personDaoImpl.index();
    }

    @Override
    public Person show(int id) {
        return personDaoImpl.show(id);
    }

    @Override
    public void save(Person person) {
        personDaoImpl.save(person);
    }

    @Override
    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = personDaoImpl.show(id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personDaoImpl.save(personToBeUpdated);

    }

    @Override
    public void deleteUser(int id) {
        personDaoImpl.deleteUser(id);
    }
}
