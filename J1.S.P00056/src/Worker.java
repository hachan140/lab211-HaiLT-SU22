/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Worker {
    private String code;
    private String name;
    private int age;
    private double salary;
    private String workloca;

    public Worker() {
    }

    public Worker(String code, String name, int age, double salary, String workloca) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workloca = workloca;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getWorkloca() {
        return workloca;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkloca(String workloca) {
        this.workloca = workloca;
    }
    
}
