package de.ait.consultation;

/**
 * Класс BeautySalonApp демонстрирует работу системы управления салоном красоты.
 * The BeautySalonApp class demonstrates the functionality of the beauty salon management system.
 */
public class BeautySalonApp {

    /**
     * Главный метод для запуска приложения.
     * The main method to run the application.
     *
     * @param args Аргументы командной строки / Command-line arguments
     */
    public static void main(String[] args) {
        // Создаем экземпляр салона красоты / Create an instance of the beauty salon
        BeautySalon beautySalon = new BeautySalon();

        // Добавляем услуги в салон красоты / Add services to the beauty salon
        Service serviceEmilyClark = new Haircut("Эмили Кларк", "Стрижка", 40, true);
        beautySalon.addService(serviceEmilyClark);

        Service serviceJohnDoe = new Manicure("Джон Доу", "Маникюр", 40, false);
        beautySalon.addService(serviceJohnDoe);

        Service serviceAnnaSmith = new Facial("Анна Смит", "Уход за лицом", 50, 70, 0);
        beautySalon.addService(serviceAnnaSmith);

        // Печатаем квитанции для всех услуг / Print receipts for all services
        beautySalon.printAllReceipts();
    }
}
