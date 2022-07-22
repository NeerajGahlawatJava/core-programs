package com.app.java.core;

public class Employee{

    private int empId;

    private String name;

    private int age;

    private double salary;

    private String gender;

    private String dept;

    private String status;

    public int compareTo(Employee employee){
        return employee.getName().compareTo(this.getName());
    }

    public Employee(int empId, String name, int age, double salary, String gender, String dept, String status) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.dept = dept;
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    public String getGender(){
        return gender;
    }

    Employee employee;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept(){
        return dept;
    }
}
