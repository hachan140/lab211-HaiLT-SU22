
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
public class Main {
    public static void main(String[] args) {
        
        List<Doctor> ld = new ArrayList<>();
        while(true){
            int choice = Manager.menu();
            switch(choice){
            case 1:
                Manager.addDoctor(ld);
                break;
            case 2:
                Manager.updateDoctor(ld);
                break;
            case 3:
                Manager.deleteDoctor(ld);
                break;
            case 4:
                Manager.searchDoctor(ld);
                break;
            case 5:
                return;
        }
        }
        
    }
}
