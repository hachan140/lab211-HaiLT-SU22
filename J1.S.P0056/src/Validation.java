
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
        String word;
        while(true){
            System.out.print(msg);
            word = sc.nextLine();
            if(word.matches(regex))
                return word;
        }
    }
    public int checkAge(String msg){
        int n;
        while(true){
            try{
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if(n < 18 || n > 50)
                    System.out.println("Invalid age!");
                else return n;
            }catch(Exception e){
                System.out.println("You must input a number!");
            }
        }
    }
    public double checkSalary(String msg, double max){
        double salary;
        while(true){
            try{
                System.out.print(msg);
                salary = Double.parseDouble(sc.nextLine());
                if(salary <= 0 || salary > max)
                    System.out.println("Invalid!");
                else return salary;
            } catch(Exception e){
                System.out.println("You must input a number!");
            }
        }
    }
    public String checkDate() {
        String d = "";
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
       
        df.setLenient(false); //set false để check tính hợp lệ (tháng 2 phải có 28 - 29 ngày ...)
        while (true) {
            try {
                d = sc.nextLine().trim();
                Date date = df.parse(d); //parse thành format
                
                break;
            } catch (ParseException ex) {
                System.out.print("Invalid date!!! Re-enter: ");
            }
        }
        return d;
    }
    
}
