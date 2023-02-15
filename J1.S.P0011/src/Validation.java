
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
    public String checkInput(String msg, String regex){
        String n;
        while(true){
            System.out.print(msg);
            n = sc.nextLine();
            
            if(n.matches(regex))
                return n;
            System.out.println("Invalid value!");
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
    
    
}
