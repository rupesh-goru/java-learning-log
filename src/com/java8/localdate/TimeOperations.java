package com.java8.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeOperations {
    public static void main(String[] args) {


        //Formats
        /*DateTimeFormatter is a Java 8 class used to format date/time objects into strings and parse strings into date/time objects.
        OR
        DateTimeFormatter is used to format and parse date/time values using predefined or custom patterns.
        * Syntax:
        DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

LocalDateTime dateTime = LocalDateTime.now();
syntax to format wile printing: variableName.format(formatter);
System.out.println(dateTime.format(formatter));

* MM → Month
mm → Minute

*HH → 24-hour format
hh → 12-hour format

/ or - is possible.

Allowed:
DD → Day of year
dd → Day of month

***(Month lower case is not allowed)***
MMMM for month name
MMM for short format for month
MM for month in digit format

YY gives last 2 digits of year
YYYY gives full year
*/

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDateTime dateToday = LocalDateTime.now();
        System.out.println(dateToday.format(formatter));


        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        LocalDate date = LocalDate.of(1971,9,2);
        System.out.println(date.format(customFormatter));


        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime dateTime2 = LocalDateTime.of(
                2001, 12, 11, 14, 30, 45
        );
        System.out.println(dateTime2.format(formatter2));



        //localDateTime();
    }

    private static void localDateTime() {
        /*LocalDateTime is a Java 8 class used to represent date and time together, without timezone information.
        * Date + Time
        * Syntax: LocalDateTime dateTime = LocalDateTime.now();
        *System.out.println(dateTime); */

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);


        //Printing customized dateTime: LocalDateTime.of(YYYY, MM, DD,HH,MM,SS)
        //HH — 24-hour format
        //The hour in LocalDateTime.of() must be 0–23.

        LocalDateTime customizedDateTime = LocalDateTime.of(2001,12,11,23,19, 44);
        System.out.println(customizedDateTime);

        System.out.println(LocalDateTime.now().getHour());
        System.out.println(LocalDateTime.now().getMinute());
        System.out.println(LocalDateTime.now().getSecond());
        System.out.println(LocalDateTime.now().getNano());
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println(LocalDateTime.now().minusHours(23));
        System.out.println(LocalDateTime.now().minusMinutes(28));
    }
}
