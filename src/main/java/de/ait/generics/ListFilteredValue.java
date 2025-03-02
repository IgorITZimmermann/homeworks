package de.ait.generics;

import java.util.ArrayList;
import java.util.List;

// Класс для фильтрации списка числовых значений
// Class for filtering a list of numeric values
public class ListFilteredValue {

    // Метод для получения отфильтрованного списка значений, превышающих заданное значение
    // Method to get a filtered list of values exceeding the specified value
    public static List<Double> getFilteredList(List<? extends Number> list, double maxValue){
        List<Double> result = new ArrayList<>();
        for(Number number: list){
            if(number.doubleValue() > maxValue){
                result.add(number.doubleValue());
            }
        }
        return result;
    }

}