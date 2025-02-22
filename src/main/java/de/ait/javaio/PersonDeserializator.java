package de.ait.javaio;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

@Slf4j
public class PersonDeserializator {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.ser"))){
            Person resultPerson = (Person) objectInputStream.readObject();
            System.out.println(resultPerson);
        }
        catch (IOException exception){
            log.error("Error reading from file");
        }
        catch (ClassNotFoundException exception){
            log.error("Class not found");
        }
    }
}
