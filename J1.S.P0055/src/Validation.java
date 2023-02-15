
import java.util.ArrayList;
import java.util.List;
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

    static int checkChoice(int start, int end) {
        int n;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n >= start && n <= end) {
                    break;
                }
                    else throw new Exception("Error!");
                } catch(Exception e){
                    System.out.println("Error, re-enter!");
                
            }

        }
        return n;
    }
    static String checkString(String msg, String regex){
        String word;
        while(true){
            System.out.print(msg);
            word = sc.nextLine();
            if(word.matches(regex))
                return word;
            else System.out.println("Invalid!");
        }
    }
     static boolean checkCodeExist(List<Doctor> ld, String code) {
        for (Doctor doctor : ld) {
            if (code.equalsIgnoreCase(doctor.getCode())) {
                return false;
            }
        }
        return true;
}
    static int checkInt(String msg){
        int n;
        while(true){
            try{
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if(n < 0)
                    System.out.println("Out of range!");
                else break;
            }catch(Exception e){
                System.out.println("Please input a number!");
            }
        }
        return n;
}
    public static boolean checkYN(String msg){
       String choice = checkString(msg, "[Y|y|N|n]");
       if(choice.equalsIgnoreCase("Y"))
           return true;
       return false;
    }
}
