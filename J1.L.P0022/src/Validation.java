
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
    Scanner sc = new Scanner(System.in);
    public String checkString(String msg, String regex){
        String n;
        while(true){
            System.out.print(msg);
            n = sc.nextLine();
            if(n.toLowerCase().matches(regex))
                return n;
            else
                System.out.println("Invalid!");
        }
    }
     public  Date checkDate(String msg, String format){
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
    public int checkInt(String msg, int min, int max){
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
    public String checkInputGraduationRank(String msg) {
        while (true) {
            System.out.print(msg);
            String result = sc.nextLine();
            if (result.equalsIgnoreCase("Excellence")
                    || result.equalsIgnoreCase("Good")
                    || result.equalsIgnoreCase("Fair")
                    || result.equalsIgnoreCase("Poor")) {
                return result;
            } else {
                System.err.println("Please input string: Excellence, Good, Fair, Poor");
                System.out.print("Enter again: ");
            }
        }
    }
    public boolean checkYN(String msg){
        String yn = checkString(msg, "[Y|y|n|N]");
        if(yn.charAt(0) == 'Y' || yn.charAt(0) == 'y')
            return true;
        return false;
    }
    
}
