
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
public class Manager extends Validation{
    public List<Worker> list = new ArrayList<>();
    public int checkCodeExist(String code){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getCode().equalsIgnoreCase(code))
                return i;
            
        }
        return -1;
    }
    public boolean addWorker(Worker worker){
        System.out.println("--------- Add Worker ---------");
        String code;
        do{
            code = checkString("Enter Code: ", "[W|w]\\s\\d");
            if(checkCodeExist(code) != -1){
                System.out.println("Code Existed!");
                return false;
            }
                
            else break;
        } while(true);
        
        
        String name = checkString("Enter Name: ", "[A-Za-z]+(\\s[A-Za-z]+){0,3}");
        int age = checkAge("Enter Age: ");
        double salary = checkSalary("Enter Salary: ", Double.MAX_VALUE);
        String wlocation = checkString("Enter work location: ", ".*"); //* la co the k nhap j
        worker.setCode(code);
        worker.setAge(age);
        worker.setSalary(salary);
        worker.setWorkloca(wlocation);
        list.add(worker);
        return true;
    }
    public List<SalaryHistory> ls = new ArrayList<>();
    public boolean changeSalary(SalaryStatus status, String code, double amount){
        
        if(status.getStatus().equalsIgnoreCase("up")){
            
            list.get(checkCodeExist(code)).setSalary(amount + list.get(checkCodeExist(code)).getSalary());
        }
        
        if(status.getStatus().equalsIgnoreCase("down")){
            while(list.get(checkCodeExist(code)).getSalary() < amount){
                System.out.println("Re-input a number smaller than salary!");
                
                amount = checkSalary("Amount = ", list.get(checkCodeExist(code)).getSalary());
                
            }
            list.get(checkCodeExist(code)).setSalary( list.get(checkCodeExist(code)).getSalary() - amount);
        }
        Worker w = list.get(checkCodeExist(code));
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        ls.add(new SalaryHistory(sf.format(d), w.getCode(), w.getName(), w.getAge(), w.getSalary(), w.getWorkloca(), status.getStatus()));
        return true;
    }
    public List<SalaryHistory> getInfomationSalary(){
        
        return ls;
    }
    public void database(){
        list.add(new Worker("W 1", "ha", 20, 10000, "Paris" ));
        list.add(new Worker("W 2", "ha1", 19, 5000, "HN" ));
        list.add(new Worker("W 3", "ha3", 20, 10000, "Vinh" ));
    }
    
}
