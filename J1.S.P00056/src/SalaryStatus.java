/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SalaryStatus extends Worker {
    private String status;
    
    public SalaryStatus() {
    }

    public SalaryStatus( String code, String name, int age, double salary, String workloca, String status) {
        super(code, name, age, salary, workloca);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
