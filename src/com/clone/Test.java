package com.clone;

public class Test {
    static void main(String[] args) throws CloneNotSupportedException {

        Address address1 = new Address(12345,"Visakhapatnam");
        Employee emp1 = new Employee(1, "Sahithi T", 40000, address1);

        System.out.println(emp1);
        /*Explicit type casting: (Employee)emp1.clone()*/
        Employee emp2 = (Employee)emp1.clone();
        System.out.println(emp2);

        emp1.setEmpId(2);
        emp1.setEmpName("Rupesh G");
        emp1.getAddress().setCity("San Francisco");
        System.out.println("==========================================================================================================================================");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
