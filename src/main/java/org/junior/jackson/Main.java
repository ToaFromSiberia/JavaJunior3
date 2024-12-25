package org.junior.jackson;

import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Random rnd = new Random();


        List<Person> persons = List.of(
                new Person("Ivan", 19),
                new Person("Sergey", 19),
                new Person("Maria", 18)
        );
        persons.forEach(n -> n.setCPA(rnd.nextDouble()*4.0 + 1));

        System.out.println(persons);


        JsonMapper jm = new JsonMapper();
        jm.writeValue(new File("persons.json"), persons);

        List<Person> test = jm.readValue(new File("persons.json"), jm.getTypeFactory().constructCollectionType(List.class, Person.class));
        System.out.println(test);

    }
}