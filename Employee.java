package com.krishna;

public class Employee {
     String Eid;
    String Ename;
    String Eadhar;
    //Has a realationship
    Account account;

    //contructor injection
    public Employee(String Eid, String Ename, String Eadhar, Account account) {
        super();
        this.Eid = Eid;
        this.Ename = Ename;
        this.Eadhar = Eadhar;
        this.account = account;
    }

    public void getEmployeeDetail() {
        System.out.println("Employee details are :: ");
        System.out.println("Eid :: " + Eid);
        System.out.println("Ename :: " + Ename);
        System.out.println("Eadhar :: " + Eadhar);
        System.out.println("====================================");
        System.out.println("Account details are ::  ");
        System.out.println("Account number :: " + account.accNo);
        System.out.println("Account name ::" + account.accName);
        System.out.println("Account Type :: " + account.accType);
    }
}
