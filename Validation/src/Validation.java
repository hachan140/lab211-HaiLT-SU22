
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    static double checkDouble(String msg){
        double d;
        while(true){
            try{
                System.out.print(msg);
                d = Double.parseDouble(sc.nextLine());
                if(d <= 0)
                    System.out.println("Input a positive number!");
                else break;
            } catch(Exception e){
                System.out.println("Input a number!");
            }
        }
        return d;
    }
 
    public static  String checkString(String msg, String regex){
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
    public static int checkInt(String msg, int min, int max){
        int n;
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if(n < min || n > max){
                    System.out.println("Out of range!");
                }
                else return n;
            } catch(Exception e){
                System.out.println("You must enter an integer number!");
            }
            
        }
    }
    public static void main(String[] args) {
        String phone = checkString("Enter phone number: ", "\\d{10}\\d*");
    }
}
