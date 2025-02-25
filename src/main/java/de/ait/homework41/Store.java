package de.ait.homework41;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class Store {

    // Сканер для ввода данных от пользователя
    // Scanner for user input
    private static Scanner scanner = new Scanner(System.in);

    // Список для хранения товаров
    // List to store products
    private static List<Product> products = new ArrayList<>();

    // Имя файла для сохранения и загрузки данных
    // File name for saving and loading data
    private static String fileName = "products.dat";

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            // Выводим меню на экран
            // Print the menu
            printMenu();

            // Считываем выбор пользователя
            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine();

            // Обрабатываем выбор пользователя
            // Handle the user's choice
            switch (choice) {
                case 1:
                    // Добавить товар
                    // Add a product
                    addProduct();
                    break;
                case 2:
                    // Показать все товары
                    // Show all products
                    showAllProducts();
                    break;
                case 3:
                    // Сохранить товары в файл
                    // Save products to a file
                    saveProductsToFile();
                    break;
                case 4:
                    // Загрузить товары из файла
                    // Load products from a file
                    loadProductsFromFile();
                    break;
                case 5:
                    // Выйти из программы
                    // Exit the program
                    exit = true;
                    scanner.close();
                    break;
                default:
                    // Логируем ошибку, если выбор неверный
                    // Log an error if the choice is invalid
                    log.error("Invalid choice: {}", choice);
            }
        }
    }

    // Метод для вывода меню
    // Method to print the menu
    public static void printMenu() {
        System.out.println("\n 1. Добавить товар");
        System.out.println("\n 2. Посмотреть все товары");
        System.out.println("\n 3. Сохранить товары в файл");
        System.out.println("\n 4. Загрузить товары из файла");
        System.out.println("\n 5. Выйти");
        System.out.println("--------------------------");
    }

    // Метод для загрузки товаров из файла
    // Method to load products from a file
    public static void loadProductsFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            // Читаем список товаров из файла
            // Read the list of products from the file
            products = (List<Product>) objectInputStream.readObject();
            log.info("Load products from file: {}", fileName);
        } catch (IOException exception) {
            // Логируем ошибку, если файл не найден
            // Log an error if the file is not found
            log.error("File not found: {}", exception.getMessage());
        } catch (ClassNotFoundException exception) {
            // Логируем ошибку, если класс не найден
            // Log an error if the class is not found
            log.error("Class not found: {}", exception.getMessage());
        }
    }

    // Метод для сохранения товаров в файл
    // Method to save products to a file
    public static void saveProductsToFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            // Записываем список товаров в файл
            // Write the list of products to the file
            objectOutputStream.writeObject(products);
            log.info("Saved products to file: {}", fileName);
        } catch (IOException exception) {
            // Логируем ошибку, если файл не найден
            // Log an error if the file is not found
            log.error("File not found: {}", exception.getMessage());
        }
    }

    // Метод для отображения всех товаров
    // Method to show all products
    public static void showAllProducts() {
        for (Product product : products) {
            // Логируем информацию о каждом товаре
            // Log information about each product
            log.info("Product: {}", product);
        }
    }

    // Метод для добавления товара
    // Method to add a product
    public static void addProduct() {
        System.out.print("Название: ");
        String name = scanner.nextLine();

        System.out.print("Цена: ");
        double price = scanner.nextDouble();

        System.out.print("Количество: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Промокод: ");
        String promoCode = scanner.nextLine();

        // Создаем новый товар и добавляем его в список
        // Create a new product and add it to the list
        Product product = new Product(name, price, quantity, promoCode, 1);
        products.add(product);

        // Логируем информацию о добавленном товаре
        // Log information about the added product
        log.info("Product added: {}", product);
    }
}