
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
    public int checkInt(String msg, int min, int max){
        int n;
        while(true){
            try{
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if(n < min || n > max)
                    System.out.println("Invalid number!");
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

}
