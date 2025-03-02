package de.ait.generics;

// Класс BoxNumber, использующий обобщения для хранения числовых значений (наследников Number)
// BoxNumber class using generics to store numeric values (subclasses of Number)
public class BoxNumber <T extends Number>{

    private T number; // Числовое значение, хранящееся в коробке / Numeric value stored in the box

    // Конструктор для инициализации числового значения в коробке
    // Constructor to initialize the numeric value in the box
    public BoxNumber(T number){
        this.number = number;
    }

    // Геттер для получения числового значения из коробки
    // Getter to retrieve the numeric value from the box
    public T getNumber(){
        return number;
    }

    // Метод для получения числового значения в виде double
    // Method to get the numeric value as a double
    public double getDoubleNumber(){
        return number.doubleValue();
    }

}