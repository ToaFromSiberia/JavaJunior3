package org.junior.serial;

import org.junior.utils.*;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        Random rnd = new Random();

        List<Person> persons = List.of(
                new Person("Ivan", 19),
                new Person("Sergey", 19),
                new Person("Maria", 18)
        );
        persons.forEach(n -> n.setCPA(rnd.nextDouble()*4.0 + 1));

        System.out.println(persons);

        DeSer.serialize(persons, "persons.bin");
        List<Person> test = (List<Person>) DeSer.deserialize("persons.bin");

        System.out.println(test);
    }



}