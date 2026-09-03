package com.java8.methodreferences;

public class Employee {

    int empId;
    String name;
    Department department;

    public Employee() {
    }

    public Employee(int empId, String name, Department department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
