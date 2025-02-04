/*
 * Этот класс предназначен для работы с медицинским расписанием и временем.
 * Он использует API даты и времени Java для планирования и управления медицинскими событиями.
 *
 * This class is designed for working with medical scheduling and time management.
 * It uses Java's date and time API to schedule and manage medical events.
 */

package de.ait.timeapi;

import java.util.Calendar;
import java.util.Date;

public class OldDateTimeCalendar {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long timeMilis = date.getTime();
        System.out.println(timeMilis);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        System.out.println(year);
        System.out.println(month);
    }
}
