package de.ait.excepionshandling;

import de.ait.homework27.Employee;

import java.util.Arrays;

public class Calculator {

    public static void main(String[] args) {
        // Метод divide обрабатывает исключение при делении на ноль
        // The divide method handles the exception when dividing by zero
        //divide(10, 0);

        // Метод divideNumbers выбрасывает исключение при делении на ноль
        // The divideNumbers method throws an exception when dividing by zero
       // divideNumbers(10, 0);

        //divideNumbersThrowsException(10, 0);
    }

    // Метод для деления двух чисел с обработкой исключения
    // Method for dividing two numbers with exception handling
    public static void divide(int a, int b) {
        int result = 0;
        try {
            result = a / b; // Может возникнуть ArithmeticException при b = 0
            Employee employee = null;
            employee.getId();
            // ArithmeticException may occur when b = 0
        }

        catch (ArithmeticException exception) {
            // Сообщение об ошибке, если деление на ноль
            // Error message if dividing by zero
            System.out.println("Нельзя делить на ноль"); // "Cannot divide by zero"

            // Вывод стека вызовов для диагностики
            // Printing the stack trace for diagnostics
            System.out.println(Arrays.stream(exception.getStackTrace()).toList().toString());
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("ArrayIndexOutOfBoundsException logic");
        }
        catch (NullPointerException exception){
            System.out.println("NullPointerException logic");
        }
        catch (Exception exception){
            System.out.println("Exception logic");
        }
        finally {
            System.out.println(" Hi am finally");
        }



        // Вывод результата (будет 0, если произошло исключение)
        // Printing the result (will be 0 if an exception occurred)
        System.out.println(result);
    }

    // Метод для деления двух чисел с выбрасыванием исключения
    // Method for dividing two numbers with throwing an exception
    public static void divideNumbers(int a, int b) {
        if (b == 0) {
            // Если b равно 0, выбрасывается исключение
            // If b equals 0, an exception is thrown
            throw new ArithmeticException("Нельзя делить на ноль !!!!! Учи математику !!!!");
            // "Cannot divide by zero!!!!! Learn math!!!!"
        }
        int result = a / b;
        // Вывод результата
        // Printing the result
        System.out.println(result);
    }

    public static void divideNumbersThrowsException(int a, int b) throws CloneNotSupportedException{
        if(b == 0){
            throw new CloneNotSupportedException();
        }
        int result = a / b;
        System.out.println(result);
    }
}