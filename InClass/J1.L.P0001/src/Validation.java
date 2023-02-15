
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Validation {
    Scanner sc = new Scanner(System.in);
    public String checkString(String msg, String regex){
        String n;
        while(true){
            System.out.print(msg);
            n = sc.nextLine();
            if(n.matches(regex))
                return n;
            else
                System.out.println("Invalid!");
        }
    }
    public String checkDate(String msg){
        SimpleDateFormat sf = new SimpleDateFormat("dd/mm/yyyy");
        String date;
        sf.setLenient(false);
        while(true){
            date = sc.nextLine();
            try {
                Date d = sf.parse(date);
            } catch (ParseException ex) {
                System.out.println("Invalid date");
            }
            
        }
    }
}
