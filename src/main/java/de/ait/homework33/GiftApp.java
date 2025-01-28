package de.ait.homework33;

import de.ait.exceptions.WrongCategoryException;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Scanner;

/**
 * This class is the main entry point for the Gift Management System.
 * It handles user interaction and manages the workflow of adding, viewing, and updating gifts.
 *
 * Этот класс является основной точкой входа в систему управления подарками.
 * Он обрабатывает взаимодействие с пользователем и управляет процессами добавления, просмотра и обновления подарков.
 */
@Slf4j
public class GiftApp {

    private static Scanner scanner = new Scanner(System.in); // Scanner for user input / Сканер для ввода пользователя
    private static GiftManager giftManager = new GiftManager(); // Manager for handling gift operations / Менеджер для работы с подарками

    /**
     * The main method initializes the application and starts the main menu loop.
     * Главный метод инициализирует приложение и запускает основной цикл меню.
     */
    public static void main(String[] args) {
        boolean running = true;
        showMenu(); // Display the menu / Показать меню
        while (running) {
            System.out.print("\nChoose an action: ");
            String userChoice = scanner.nextLine(); // User selects an action / Пользователь выбирает действие
            switch (userChoice) {
                case "1":
                    try {
                        addGift(); // Add a new gift / Добавить новый подарок
                    } catch (WrongCategoryException exception) {
                        log.error(exception.getMessage());
                        System.out.println(exception.getMessage());
                    }
                    break;
                case "2":
                    showGifts(); // Display all gifts / Показать все подарки
                    break;
                case "3":
                    filterGiftsByCategory(); // Filter gifts by category / Фильтровать подарки по категории
                    break;
                case "4":
                    updateGiftStatus(); // Update the status of a gift / Обновить статус подарка
                    break;
                case "5":
                    System.out.println("Exiting the program. Thank you for using the Gift Management System!");
                    running = false;
                    scanner.close(); // Close the scanner / Закрыть сканер
                    break;
                default:
                    showMenu(); // Show the menu again for invalid input / Показать меню снова для некорректного ввода
            }
        }
    }

    /**
     * Updates the status of an existing gift.
     * Обновляет статус существующего подарка.
     */
    private static void updateGiftStatus() {
        System.out.print("Enter the gift name to update its status: ");
        String giftName = scanner.nextLine().trim();
        System.out.print("Select the new status (AVAILABLE, OUT_OF_STOCK, RESERVED, DELIVERED): ");
        String newStatus = scanner.nextLine().trim();
        boolean statusUpdated = giftManager.updateGiftStatus(giftName, GiftStatus.valueOf(newStatus));
        if (statusUpdated) {
            System.out.println("Gift status updated successfully!");
            log.info("Status of gift " + giftName + " was updated to " + newStatus);
        } else {
            System.out.println("Status update is not possible. Gift: " + giftName + ", Status: " + newStatus);
            log.warn("Update was not possible. Gift: {}, Status: {}", giftName, newStatus);
        }
    }

    /**
     * Displays all the gifts stored in the system.
     * Отображает все подарки, хранящиеся в системе.
     */
    private static void showGifts() {
        List<Gift> giftsToShow = giftManager.getGifts();
        if (giftsToShow.isEmpty()) {
            System.out.println("No gifts found!");
        } else {
            int counter = 1;
            for (Gift gift : giftsToShow) {
                System.out.println(counter + ". " + gift.getName() + ", Category: " + gift.getCategory() + ", Status: " + gift.getStatus());
                counter++;
            }
        }
    }

    /**
     * Filters gifts by a specific category provided by the user.
     * Фильтрует подарки по определённой категории, выбранной пользователем.
     */
    private static void filterGiftsByCategory() {
        System.out.print("Enter the category (ELECTRONICS, TOYS, BOOKS, CLOTHING, HOME_APPLIANCES): ");
        String category = scanner.nextLine().trim();
        List<Gift> filteredGifts = giftManager.filterByCategory(GiftCategory.valueOf(category));
        if (filteredGifts.isEmpty()) {
            System.out.println("No gifts found for this category!");
        } else {
            int counter = 1;
            for (Gift gift : filteredGifts) {
                System.out.println(counter + ". " + gift.getName() + ", Status: " + gift.getStatus());
                counter++;
            }
        }
    }

    /**
     * Adds a new gift based on user input.
     * Добавляет новый подарок на основе ввода пользователя.
     */
    private static void addGift() throws WrongCategoryException {
        System.out.print("Enter the gift name: ");
        String giftName = scanner.nextLine().trim();
        System.out.print("Select the category (ELECTRONICS, TOYS, BOOKS, CLOTHING, HOME_APPLIANCES): ");
        String giftCategory = scanner.nextLine().trim();
        System.out.print("Select the status (AVAILABLE, OUT_OF_STOCK, RESERVED, DELIVERED): ");
        String giftStatus = scanner.nextLine().trim();

        try {
            Gift gift = new Gift(giftName, GiftCategory.valueOf(giftCategory), GiftStatus.valueOf(giftStatus));

            giftManager.addGift(gift);

            System.out.println("Gift added successfully!");
            log.info("Gift was added: {}", gift.getName());
        } catch (IllegalArgumentException exception) {
            System.out.println("Error adding gift. " + exception.getMessage());
            log.error("Error adding gift. {}", exception.getMessage());
            throw new WrongCategoryException("Wrong category was selected");
        } finally {
            System.out.println(" ---------  ");
        }
    }

    /**
     * Displays the main menu options to the user.
     * Отображает основные варианты меню пользователю.
     */
    private static void showMenu() {
        System.out.println("\nWelcome to the Gift Management System!");
        System.out.println("Choose an action:");
        System.out.println("1 - Add a new gift");
        System.out.println("2 - Show all gifts");
        System.out.println("3 - Filter gifts by category");
        System.out.println("4 - Update gift status");
        System.out.println("5 - Exit");
    }
}
