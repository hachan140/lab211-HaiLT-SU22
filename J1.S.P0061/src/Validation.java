
import com.sun.corba.se.impl.activation.ServerMain;
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
    static double checkDouble(String msg){
        double d;
        while(true){
            try{
                System.out.print(msg);
                d = Double.parseDouble(sc.nextLine());
                if(d <= 0)
                    System.out.println("Input a positive number!");
                else break;
            } catch(Exception e){
                System.out.println("Input a number!");
            }
        }
        return d;
    }
    static Triangle inputTriangle(){
        
        while(true){
            double a = checkDouble("Please input side A of Triangle: ");
            double b = checkDouble("Please input side B of Triangle: ");
            double c = checkDouble("Please input side C of Triangle: ");
            if(a + b > c && a+c>b && b+c>a)
                return new Triangle(a, b, c);
            else System.out.println("Not 3 sides of Triangle, re-input!");
        }
    }
    static Rectangle inputRec(){
        double w = checkDouble("Please input side width of Rectangle: ");
        double l = checkDouble("Please input side length of Rectangle: ");
        return new Rectangle(w, l);
    }
    static Circle inputCircle(){
        double r = checkDouble("Please input radius of Circle: ");
        return new Circle(r);
    }
    static void display(Rectangle rec, Circle cir, Triangle tri){
        rec.printResult();
        cir.printResult();
        tri.printResult();
    }
    
}
