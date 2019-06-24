package com.softserve.homework.p5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
    private String name;
    private int department;
    private int salary;


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee name: " + name + ", department: " + department + ", salary: " + salary;
    }

    public static void main(String[] args) throws IOException {
        Employee emp[] = new Employee[5];

        emp[0] = new Employee("Yurii", 1, 3000);
        emp[1] = new Employee("Vasil", 1, 1000);
        emp[2] = new Employee("Oleg", 1, 5000);
        emp[3] = new Employee("Tar", 2, 9000);
        emp[4] = new Employee("Yii", 2, 40000);
        System.out.println("Enter number of department");
        int a = Integer.parseInt(br.readLine());

        for (Employee i : emp) {
            if (i.getDepartment() == a)
                System.out.println(i);
        }
        System.out.println();

        Employee temp = null;
        for (int i = 0; i < emp.length; i++) {
            for (int k = i + 1; k < emp.length; k++) {
                if (emp[i].getSalary() < emp[k].getSalary()) {
                    temp = emp[i];
                    emp[i] = emp[k];
                    emp[k] = temp;
                }
            }
        } for (int i = 0; i <emp.length ; i++) {
                System.out.println(emp[i]);


        };
    }
}








