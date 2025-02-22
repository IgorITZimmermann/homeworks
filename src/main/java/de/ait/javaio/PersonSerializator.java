package de.ait.javaio;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@Slf4j
public class PersonSerializator {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Person person =  new Person(faker.name().lastName(),20, "1234");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.ser")))
        {
            objectOutputStream.writeObject(person);
            System.out.println("File written successfully");
        }
        catch (IOException exception){
           log.error("Error writing to file");
        }
    }
}
