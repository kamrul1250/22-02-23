package com.company;

public class Employee extends Person {
    private String name;
    private int id;
    private double salary;

    /*public Employee (){
    this.name ="John";
    this.id = 221154758;
    this.salary = 500000; } */

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public Employee (String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary; }

    public String getName (){
        return name;
    }
    public int getId (){
        return id;
    }
    public double getSalary (){
        return salary;
    }
}
