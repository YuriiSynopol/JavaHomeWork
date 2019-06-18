package com.softserve.homework.n4.t2;

public class ContractEmployee extends Employee implements PayInterface {

    private String federalTaxIdmember;
    private int fixedMonthlyPayment;

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, int fixedMonthlyPayment) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public ContractEmployee(String employeeId, String name) {

        super(employeeId, name);
    }


    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {

        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }


    @Override
    public int calculatePay() {
        return this.fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "Contract Employee Employee Id " +getEmployeeId()+  " Federal Tax Id member = " + federalTaxIdmember + " Fixed Monthly Payment " + fixedMonthlyPayment;
    }
}
