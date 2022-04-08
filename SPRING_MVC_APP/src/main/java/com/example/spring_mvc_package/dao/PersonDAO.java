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
        people.add(new Person(++peopleCount, "Tom"));
        people.add(new Person(++peopleCount, "Bob"));
        people.add(new Person(++peopleCount, "Mike"));
        people.add(new Person(++peopleCount, "Katy"));
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
}
