package com.example.spring_mvc_package.dao;

import com.example.spring_mvc_package.models.Person;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class PersonDAO {
    private static int peopleCount;
    private List<Person> people;

    {
        people = new LinkedList<>();
        people.add(new Person(++peopleCount, "Tom", 15, "tom@gmail.com"));
        people.add(new Person(++peopleCount, "Bob", 16, "bob@gmail.com"));
        people.add(new Person(++peopleCount, "Mike", 17, "mike@gmail.com"));
        people.add(new Person(++peopleCount, "Katy", 18, "katy@gmail.com"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElse(null);
    }

    public void save(Person person) {
        person.setId(++peopleCount);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }
}
