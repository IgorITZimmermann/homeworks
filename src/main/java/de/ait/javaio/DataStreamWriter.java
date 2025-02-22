package de.ait.javaio;

import lombok.extern.slf4j.Slf4j;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Slf4j
public class DataStreamWriter {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.bin"))){
            dataOutputStream.writeInt(123);
            dataOutputStream.writeFloat(3.14f);
            dataOutputStream.writeUTF("Hello World");
            System.out.println("File written successfully");
        }
        catch (FileNotFoundException exception){
           log.error("File not found");
        }
        catch (IOException exception){
            log.error("Error writing to file");
        }
    }
}
