
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
            if(n.matches(regex))
                return n;
            else
                System.out.println("Invalid!");
        }
    }
}
