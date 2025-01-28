package de.ait.excepionshandling;

public class CalculatorNew {

    public static void main(String[] args) {
        try {
            Calculator.divideNumbersThrowsException(20, 10);
        } catch (ArithmeticException exception) {
            System.out.println("Я делил на 0 !!!! Это моя ошибка !!!");
            exception.getStackTrace();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
