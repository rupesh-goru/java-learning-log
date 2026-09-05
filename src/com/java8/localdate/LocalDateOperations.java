package com.java8.localdate;

import java.time.LocalDate;

public class LocalDateOperations {

    public static void main(String[] args) {

        /*LocalDate represents a date without time.
        * Year + Month + Day
        * LocalDate date = LocalDate.now();
        * Common syntax: LocalDate date = LocalDate.of(2026, 9, 3);*/

        LocalDate date = LocalDate.now();
        System.out.println(date);

        //Printing customized date: LocalDate.of(YYYY, MM, DD)

        LocalDate customizedDate = LocalDate.of(2001,12,11);
        System.out.println(customizedDate);

        //Printing customized date in form of string: LocalDate.parse("YYYY-MM-DD")
        /*should use only '-' for separation, for ex: 1971-12-27.*/

        LocalDate parsed = LocalDate.parse("1971-12-27");
        System.out.println(parsed);

        //methods
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.isLeapYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.lengthOfYear());
        System.out.println(date.plusDays(1));
        System.out.println(date.minusDays(55555));
        System.out.println(date.plusMonths(96));
        System.out.println(date.minusMonths(8));

        //50th of this year.
        LocalDate date1 = LocalDate.of(2000,1,1); //leap year
        System.out.println(date1.withDayOfYear(60));

        //JFS Java full stack

        LocalDate validTill = LocalDate.of(2028,6,1);
        System.out.println(LocalDate.now().isBefore(validTill));

        LocalDate expiryDate = LocalDate.of(2027,1,1);
        System.out.println(LocalDate.now().isAfter(expiryDate));




    }
}
