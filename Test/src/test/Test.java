/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    static boolean isPerfectSquare(float num){
        int s = (int) Math.sqrt(num);
        return (Math.sqrt(num) - s == 0);
    }
     static String checkDate(String msg){
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = new Date();
        String date ;
        sf.setLenient(false);
        while(true){
            System.out.print(msg);
            try{
                date = sf.parse(d.toString()).toString();
                break;
            } catch(ParseException p){
                System.out.println("Invalid date!");
            }
        }
       return date;
    }
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(isPerfectSquare((float) 5.5));
//        System.out.println(checkDate("Date: "));
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sf.format(d));
    }
    
}
