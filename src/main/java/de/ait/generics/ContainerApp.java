package de.ait.generics;

import com.github.javafaker.Faker;
import de.ait.javaio.Person;

import java.util.List;

public class ContainerApp {
    public static void main(String[] args) {
        ContainerListApp<String> app = new ContainerListApp<>();
        app.add("Hello");
        app.add("World");
        app.add("!");

        System.out.println(app.get(0));

        ContainerListApp<Person> personApp = new ContainerListApp<>();
        Faker faker = new Faker();
        Person person =  new Person(faker.name().lastName(),34,"111");
        personApp.add(person);

        List<Person> result =  personApp.getElements();
        personApp.printElements(result);


    }
}
