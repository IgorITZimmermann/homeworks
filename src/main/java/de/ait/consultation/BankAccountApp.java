package de.ait.consultation;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class BankAccountApp {
    public static void main(String[] args) {
        Faker faker = new Faker();
        BankAccount account1 = new BankAccount("1234567",1000, faker.name().lastName(),1111);
        BankAccount account2 = new BankAccount("7654321",2000, faker.name().lastName(),2222);
        BankAccount account3 = new BankAccount("3456789",3000, faker.name().lastName(),3333);

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        String fileName = "accounts.dat";

        saveAccounts(accounts, fileName);

        loadAccounts(fileName);

    }

    private static void saveAccounts(List<BankAccount> accounts, String fileName) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))){
            objectOutputStream.writeObject(accounts);
            log.info("Saved accounts to file: {}", fileName);
        }
        catch (IOException exception){
            log.error("File not found: {}", exception.getMessage());
        }

    }

    private static void loadAccounts(String fileName) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){
            List<BankAccount> bankAccounts = (List<BankAccount>) objectInputStream.readObject();
            log.info("Loaded accounts from file: {}", fileName);
            for (BankAccount bankAccount : bankAccounts) {
                log.info("Account: {}", bankAccount);
            }
        }
        catch (IOException exception){
            log.error("File not found: {}", exception.getMessage());
        }
        catch (ClassNotFoundException exception){
            log.error("Class not found: {}", exception.getMessage());
        }
    }
}
