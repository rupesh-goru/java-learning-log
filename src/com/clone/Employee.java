package com.clone;

public class Employee implements Cloneable {

    private int empId;
    private String empName;
    private double salary;
    private Address address; //has-a-relationship.

    public Employee() {
    }

    public Employee(int empId, String empName, double salary, Address address) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.address = address;
    }
    /*Copy constructor.*/
    public Employee(Employee emp) {

        this.empId = emp.empId;
        this.empName = emp.empName;
        this.salary = emp.salary;
        this.address = new Address(emp.address);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
       return new Employee(this);
    }
}
