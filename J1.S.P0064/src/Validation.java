
import java.text.SimpleDateFormat;
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
public class Validation {
    static Scanner sc = new Scanner(System.in);
    static String checkPhone(String msg, String regex){
        String n;
        while(true){
            System.out.print(msg);
            n = sc.nextLine();
            if(n.matches(regex))
                return n;
        }
    }
    static String checkDate(String msg, String regex){
        SimpleDateFormat sf = new SimpleDateFormat(regex);
        String d;
        while(true){
            System.out.print(msg);
            d = sc.nextLine();
            try{
                sf.parse(d);
                break;
            } catch(Exception e){
                System.out.println("Invalid date input, plz enter again!");
            }
            
        }
        return d;
    }
}
