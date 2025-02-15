package de.ait.homework38;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {

    /**
     * Метод для выполнения арифметических операций над двумя числами.
     * В зависимости от переданной операции, выполняет сложение, вычитание, умножение или деление.
     * Если операция неизвестна, выбрасывает исключение.
     *
     * @param firstNumber первое число
     * @param secondNumber второе число
     * @param операция арифметическая операция (ADD, SUBTRACT, MULTIPLY, DIVIDE)
     * @return результат выполнения операции
     * @throws IllegalArgumentException если операция неизвестна
     *
     * Method to perform arithmetic operations on two numbers.
     * Depending on the operation provided, it performs addition, subtraction, multiplication, or division.
     * If the operation is unknown, it throws an exception.
     *
     * @param firstNumber the first number
     * @param secondNumber the second number
     * @param operation the arithmetic operation (ADD, SUBTRACT, MULTIPLY, DIVIDE)
     * @return the result of the operation
     * @throws IllegalArgumentException if the operation is unknown
     */
    public int calculate(int firstNumber, int secondNumber, Operation operation) {
        switch (operation){
            case ADD:
                return add(firstNumber, secondNumber);
            case SUBTRACT:
                return firstNumber - secondNumber;
            case MULTIPLY:
                return firstNumber * secondNumber;
            case DIVIDE:
                return divide(firstNumber, secondNumber);
            default:
                log.error("Unknown operation {}", operation);
                throw new IllegalArgumentException("Unknown operation" + operation.name());
        }
    }

    /**
     * Метод для сложения двух чисел.
     *
     * @param firstNumber первое число
     * @param secondNumber второе число
     * @return сумма двух чисел
     *
     * Method to add two numbers.
     *
     * @param firstNumber the first number
     * @param secondNumber the second number
     * @return the sum of the two numbers
     */
    private int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Метод для деления двух чисел.
     * Если второе число равно нулю, выбрасывает исключение.
     *
     * @param firstNumber первое число
     * @param secondNumber второе число
     * @return результат деления
     * @throws ArithmeticException если второе число равно нулю
     *
     * Method to divide two numbers.
     * If the second number is zero, it throws an exception.
     *
     * @param firstNumber the first number
     * @param secondNumber the second number
     * @return the result of the division
     * @throws ArithmeticException if the second number is zero
     */
    private int divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            log.error("Division by zero is not allowed");
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return firstNumber / secondNumber;
    }
}