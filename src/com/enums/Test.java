package com.enums;

public class Test {
    static void main(String[] args) {

        Day day = Day.MONDAY;
        System.out.println(day);

        StatusCode statusCode = StatusCode.SUCCESS;
        System.out.println(statusCode + " = " + statusCode.getCode());

    }
}
