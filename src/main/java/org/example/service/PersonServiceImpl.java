package org.example.service;

import org.example.dao.PersonDao;
import org.example.models.Person;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonServiceImpl implements PersonService {
    private final PersonDao personDao;

    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public List<Person> index() {
        return personDao.index();
    }

    @Override
    public Person show(int id) {
        return personDao.show(id);
    }

    @Override
    public void save(Person person) {
        personDao.save(person);
    }

    @Override
    public void update(int id, Person updatedPerson) {
        personDao.update(id, updatedPerson);
    }

    @Override
    public void deleteUser(int id) {
        personDao.deleteUser(id);
    }
}
