package com.softserve.homework.hw4.t2;

public abstract class Employee implements PayInterface {
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract int calculatePay();

    public static void main(String[] args) {
        Employee emp[] = new Employee[4];

        emp[0] = new SalariedEmployee("126", "Vasya", "456484321321", 900, 120);
        emp[1] = new SalariedEmployee("125", "Kolya", "254846848564", 850, 128);
        emp[2] = new ContractEmployee("111", "Max", "788798", 12000);
        emp[3] = new ContractEmployee("112", "Mike", "7989654", 14000);

        for(Employee i : emp){
            System.out.println(i + ", Average monthly wage = " + i.calculatePay());
        }

    }


}
