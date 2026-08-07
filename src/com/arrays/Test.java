package com.arrays;

public class Test {
    static void main(String[] args) {
        Employee emp1 = new Employee(1, "Rupesh", "Java", 100000);
        Employee emp2 = new Employee(2, "Sahithi", "Python", 100000);
        Employee emp3 = new Employee(3, "Smrithi", "Javascript", 100000);
        Employee emp4 = new Employee(4, "Hareesh", "React", 200000);
        Employee emp5 = new Employee(5, "Shaheen", "Typescript.ts", 100000);


        // to create an array size declaration is must.
        Employee [] employees = new Employee[5];
        employees[0] =  emp1;
        employees[1] =  emp2;
        employees[2] =  emp3;
        employees[3] =  emp4;
        employees[4] =  emp5;
        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println(employees[2]);
        System.out.println(employees[3]);
        System.out.println(employees[4]);

        //Can access like this as well.
        Employee emp = employees[4];
        System.out.println(emp == employees[4]);
        System.out.println(emp);

        //can access with loop as well
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }

        //can access with for-each as well
        for(Employee e:employees){
            System.out.println(e.getDepartment());
        }

        //can set values using for and for- each loop as well

    }
}
