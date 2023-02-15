
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
    static List<Employee> ep = new ArrayList<>();
    Validation v = new Validation();
    public int checkIDExist(String id){
        for (int i = 0; i < ep.size(); i++) {
            if(ep.get(i).getId().equalsIgnoreCase(id));
            return i;
        }
        return -1;
    }
    public void addEmployee(){
        String id;
        do{
            id = v.checkString("Enter ID: ", "[I|i][D|d]\\d+");
            if(checkIDExist(id) != -1){
                System.out.println("Employee has existed!");
            }
            else break;
        }while(true);
        
    }
}
