package de.ait.javaio;

import lombok.extern.slf4j.Slf4j;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Slf4j
public class DataStreamReader {
    public static void main(String[] args) {
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data.bin"))){
            int numberInt = dataInputStream.readInt();
            float numberFloat = dataInputStream.readFloat();
            String string = dataInputStream.readUTF();

            System.out.println("Number int: " + numberInt);
            System.out.println("Number float: " + numberFloat);
            System.out.println("String: " + string);
        }
        catch (IOException fileNotFoundException){
            log.error("File not found");
        }
    }
}
