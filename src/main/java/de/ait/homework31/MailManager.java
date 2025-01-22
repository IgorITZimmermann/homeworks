package de.ait.homework31;

// Класс MailManager содержит основной метод для управления почтовыми отправлениями.
// The MailManager class contains the main method to manage mail items.
public class MailManager {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice(); // Создание нового почтового отделения.
        // Creating a new post office.

        // Создание и добавление письма в почтовое отделение.
        // Creating and adding a letter to the post office.
        Letter letter = new Letter("Leonardo DiCaprio", "Brad Pitt", 0.05, true);
        postOffice.addMailItem(letter);

        // Создание и добавление посылки в почтовое отделение.
        // Creating and adding a package to the post office.
        Package packageJohansson = new Package("Scarlett Johansson", "Chris Hemsworth", 2.5, 30, 30, 15);
        postOffice.addMailItem(packageJohansson);

        // Создание и добавление рекламного сообщения в почтовое отделение.
        // Creating and adding an advertisement to the post office.
        Advertisement advertisement = new Advertisement("Tom Cruise", "Все жители Голливуда", 0.1, 100);
        postOffice.addMailItem(advertisement);

        // Вывод деталей всех почтовых отправлений и расчёт общей стоимости доставки.
        // Printing details of all mail items and calculating the total shipping cost.
        postOffice.printAllDetails();
        postOffice.calculateTotalShippingCost();
    }
}