package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.models.Person;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class PersonDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<Person> index() {
        return entityManager.createQuery("from Person", Person.class).getResultList();
    }
    @Transactional(readOnly = true)
    public Person show(int id) {
        return entityManager.find(Person.class, id);
    }
    @Transactional
    public void save(Person person) {
        entityManager.merge(person);
    }
    @Transactional
    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = entityManager.find(Person.class, id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
    }
    @Transactional
    public void deleteUser(int id) {
        entityManager.remove(entityManager.find(Person.class, id));
    }
}
