package com.softserve.homework.n4.t2;

public class SalariedEmployee extends Employee implements PayInterface {

    private String socialSecurityNumber;
    private int hourlyRate;
    private int numberHours;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, int hourlyRate, int numberHours) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberHours = numberHours;
    }

    public SalariedEmployee(String employeeId, String name) {
        super(employeeId, name);
    }


    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setNumberHours(int numberHours) {
        this.numberHours = numberHours;
    }


    @Override
    public int calculatePay() {
        return this.hourlyRate * this.numberHours;
    }

    @Override
    public String toString() {
        return "Salaried Employee Id " +getEmployeeId() + " Social Security Number = " + socialSecurityNumber + " Hourly Rate " + hourlyRate + " Number Hours = " + numberHours;
    }
}
