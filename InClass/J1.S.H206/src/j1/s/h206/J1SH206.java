/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h206;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SH206 {

    /**
     * @param args the command line arguments
     */
    
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
    public static void printSquare(int min, int max){
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int k = min; k < i; k++) {
                System.out.print(k);
            }
            System.out.println("");
    }
    }
    public static void main(String[] args) {
        int min = checkInt("Min = ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        int max = checkInt("Max = ", min, Integer.MAX_VALUE);
        printSquare(min, max);
        
        
    }
    
}
