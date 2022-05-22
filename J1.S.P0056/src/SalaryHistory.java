/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SalaryHistory extends Worker{
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public SalaryHistory() {
    }

    public SalaryHistory(String date) {
        this.date = date;
    }

    public SalaryHistory(String date, String code, String name, int age, double salary, String workloca, String status) {
        super(code, name, age, salary, workloca, status);
        this.date = date;
    }

    public String toString() {
        return String.format("%-5s%-10s%-5s%-10s%-10s%s", super.getCode(), super.getName(), super.getAge(), super.getSalary(), super.getStatus(), date); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
