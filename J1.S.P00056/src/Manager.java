
import java.util.ArrayList;
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
        int age = v.checkAge("Enter Age: ");
        double salary = v.checkSalary("Enter Salary: ", Double.MAX_VALUE);
        String wloca = v.checkString(".*", name);
        list.add(new Worker(code, name, age, salary, wloca));
        return true;
    }
    
}
