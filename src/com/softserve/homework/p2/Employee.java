package com.softserve.homework.p2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    public static double totalSum = 0;


    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum=getSalary();
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return (double) hours * rate;
    }

    public double getBonuses() {
        return (double) (hours * rate) * 0.1;
    }

    @Override
    public String toString() {
        return "Employee name= " + name + ", rate= " + rate + ", hours= " + hours;
    }


    public static void main(String[] args) {

        Employee emp1 = new Employee("Kolya", 15, 8);
        Employee emp2 = new Employee("Max", 20, 30);
        Employee emp3 = new Employee("Mike", 30, 100);

        System.out.println(emp1.getBonuses());
        System.out.println(emp2.getSalary());
        System.out.println(Employee.totalSum);

    }
}
