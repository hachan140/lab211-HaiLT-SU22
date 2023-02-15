
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
public class Main {
    public static Date checkDate(String msg, String format){
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat(format);
        sf.setLenient(false);
        Scanner sc = new Scanner(System.in);
     
        while(true){
            System.out.print(msg);
            try{
                d = sf.parse(sc.nextLine());
                return d;
            } catch (ParseException ex) {
                System.out.println("Invalid date!");
            }
            
        }
        
    }
    public static void main(String[] args) {
        Date date1 = checkDate("Please enter the first date: ", "MMM/dd/yyyy");
        Date date2 = checkDate("Please enter the second date: ", "dd/MM/yyyy");
        if(date1.compareTo(date2) > 0){
            System.out.println("Date1 is after Date2");
        }
        else if(date1.compareTo(date2) < 0)
            System.out.println("Date1 is before Date2");
        else
            System.out.println("Date1 is equal to Date2");
    }
}
