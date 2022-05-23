/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Validation {
    public static int checkInt(String msg, int min, int max){
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            try{
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if(n >= min && n <= max)
                    break;
                else System.out.println("Out of range!");
            } catch(Exception e){
                System.out.println("You must input an integer!");
            }
        }
        return n;
    }
}

