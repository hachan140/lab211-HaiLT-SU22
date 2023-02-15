/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0020;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Validation {
    public static int checkInt(String msg, int min, int max){
        int n;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print(msg);
            try{
                n = Integer.parseInt(sc.nextLine());
                if(n >= min && n <= max)
                    break;
                else System.out.println("Out of range!");
            } catch(Exception e){
                System.out.println("You must enter an integer number!");
            }
                
        }
        return n;
    }
}
