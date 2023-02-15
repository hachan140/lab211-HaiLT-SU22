
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Manager {
    public List<Worker> list = new ArrayList<>();
    Validation v = new Validation();
    public int checkCodeExist(String code){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getCode().equalsIgnoreCase(code))
                return i;
        }
        return -1;
    }
    public boolean addWorker(Worker worker){
        System.out.println("---------Add Worker---------");
        String code;
        do{
             code = v.checkString("Enter Code: ", "[W|w]\\s\\d+");
            if(checkCodeExist(code) != -1){
                System.out.println("Code Existed!");
                return false;
            }
            else break;
        } while(true);
        String name = v.checkString("Enter Name: ", "[A-Za-z][a-z]+(\\s[A-Za-z][a-z]+){0,3}");
        int age = v.checkInt("Enter Age: ", 18, 50);
        double salary = v.checkSalary("Enter Salary: ", Double.MAX_VALUE);
        String wloca = v.checkString("Enter Work Location: ", ".*");
        list.add(new Worker(code, name, age, salary, wloca));
        return true;
    }
    List<SalaryHistory> sh = new ArrayList<>();
    public void changeSalary(SalaryStatus sstatus, String code, double amount){
        
        if(sstatus.getStatus().equalsIgnoreCase("up")){
            list.get(checkCodeExist(code)).setSalary(amount + list.get(checkCodeExist(code)).getSalary());
        }
        else{
            list.get(checkCodeExist(code)).setSalary(list.get(checkCodeExist(code)).getSalary() - amount);
        }
        Worker w = list.get(checkCodeExist(code));
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        sh.add(new SalaryHistory(sf.format(d), w.getCode(), w.getName(), w.getAge(), w.getSalary(), w.getWorkloca(), sstatus.getStatus()));
        
    }
    public void displayInfo(){
         System.out.printf("%-5s%-10s%-10s%-15s%-15s%-20s","Code", "Name", "Age", "Salary", "Status", "Date" );
         System.out.println("");
        for (SalaryHistory sHistory : sh) {
            System.out.printf("%-5s%-10s%-10s%-15s%-15s%-20s",sHistory.getCode(), sHistory.getName(),
            sHistory.getAge(), sHistory.getSalary(), sHistory.getStatus(), sHistory.getDate() );
            
        }
    }
    
}
