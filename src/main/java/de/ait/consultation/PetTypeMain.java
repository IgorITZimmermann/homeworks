package de.ait.consultation;

import java.util.Scanner;

/**
 * This class serves as the main entry point for selecting and displaying pet types and their characteristics.
 * It interacts with the user to select a pet type and outputs its characteristics.
 *
 * Этот класс является основной точкой входа для выбора и отображения типов домашних животных и их характеристик.
 * Он взаимодействует с пользователем для выбора типа животного и выводит его характеристики.
 */
public class PetTypeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input / Сканер для ввода пользователя

        System.out.println("Введите тип домашнего животного (DOG, CAT, HAMSTER, PARROT, FISH):");
        String inputPetType = scanner.nextLine().toUpperCase(); // Convert input to uppercase / Преобразование ввода в верхний регистр

        try {
            PetType selectedPetType = PetType.valueOf(inputPetType); // Parse user input to PetType / Преобразование ввода в PetType

            System.out.println("Вы выбрали: " + selectedPetType.getDescription()); // Output the selected pet type / Вывод выбранного типа животного

            System.out.println("Характеристики:");
            switch (selectedPetType) {
                case DOG:
                    System.out.println(PetCharacteristics.FRIENDLY.getDescription());
                    break;
                case CAT:
                    System.out.println(PetCharacteristics.INDEPENDENT.getDescription());
                    break;
                case HAMSTER:
                    System.out.println(PetCharacteristics.CRAZY.getDescription());
                    break;
                case PARROT:
                    System.out.println(PetCharacteristics.LOUD.getDescription());
                    break;
                case FISH:
                    System.out.println(PetCharacteristics.QUIET.getDescription());
                    break;
                default:
                    System.out.println("Неизвестное животное !!!!"); // Handle unexpected cases / Обработка неожиданных случаев
            }
        } catch (IllegalArgumentException exception) {
            System.out.println("Ошибка !!!!. Данного типа среди домашних животных нет. " + inputPetType); // Handle invalid input / Обработка некорректного ввода
            scanner.close();
        }

        /*
         * Uncomment the following code to display all available pet types and their descriptions.
         * Раскомментируйте следующий код, чтобы отобразить все доступные типы животных и их описания.
         *
         * for(PetType petType : PetType.values()){
         *     System.out.println(petType + " --> " + petType.getDescription());
         * }
         */
    }
}
