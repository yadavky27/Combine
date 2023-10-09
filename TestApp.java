package kr.ccompany;

import com.krishna.Account;
import com.krishna.Employee;

public class TestApp {
    public static void main(String[] args) {
        Account account=new Account("ABCD123","krishna","saving");
        Employee emp=new Employee("id123","krishnayadav","acb123",account);
        emp.getEmployeeDetail();
    }
}
