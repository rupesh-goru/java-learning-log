package com.java8.methodreferences;

public class Department {

    String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department() {
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }
}
