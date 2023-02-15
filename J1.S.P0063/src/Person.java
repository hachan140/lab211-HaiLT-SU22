
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private String address;
    private double salary;

    public Person(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    static Person inputPersonInfo(){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Input Information of Person");
            System.out.println("Please input name: ");  String name1 = sc.nextLine();
            System.out.println("Please input address: ");  String address1 = sc.nextLine();
            while(true){
                try{
                    System.out.println("Please input salary: ");
                     double salary1 = Double.parseDouble(sc.nextLine());
                    if(salary1 > 0 )
                        break;
                    else System.out.println("Salary is greater than zero");
                } catch(Exception e){
                    System.out.println("You must input digit");
                }
            }
        }
        return new Person(name1, address1, salary1);
    }
    static void displayPersonInfo(Person person){
        System.out.println("Information of Person you have entered: ");
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Salary: " + person.getSalary());
        System.out.println("");
    }
    static void sortBySalary(Person[] person){
        int n = person.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(person[j].getSalary() > person[j+1].getSalary() ){
                    double tmp = person[j].getSalary();
                    person[j].setSalary(person[j + 1].getSalary());
                    person[j+1].setSalary(tmp);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        System.out.println("=====Management Person programer=====");
        Person[] p = new Person[3];
        String name, address;
        double salary;
        for (int i = 0; i < 3; i++) {
            p[i] = inputPersonInfo();
        }
        sortBySalary(p);
        displayInfo(p);
    }
}
