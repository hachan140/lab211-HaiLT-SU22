

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
public class Manager {
     Scanner sc = new Scanner(System.in);
    public float checkFloat(String msg){
        float f;
        while(true){
            try{
                System.out.println(msg);
                f = Float.parseFloat(sc.nextLine());
                return f;
                
            } catch(Exception e){
                System.out.println("Input a valid number!");
            }
        }
    }
    
    public boolean isOdd(float num){
        if(num %2 == 1){
            return true;
        }
        return false;
    }
    public boolean isEven(float num){
        if(num %2 == 0){
            return true;
        }
        return false;
    }
    public boolean isPerfectSquare(float num){
        int s = (int) Math.sqrt(num);
        return (Math.sqrt(num) - s == 0);
    }
    public void inputSuperlative(){
        System.out.println("----- Calculate Equation -----");
        float a = checkFloat("Enter A: ");
        float b = checkFloat("Enter B: ");
    }
    public void calculateSEquation(float a, float b){
        
        List<Float> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        if(a == 0 && b == 0){
            System.out.println("Infinite many solution");
        }
        else if(a == 0 && b != 0)
            System.out.println("No solution");
        else{
            float c = -b/a;
            System.out.println("Solution: " + (-b/a));
            list.add(c);
        }
        System.out.println("Odd Number: ");
        for (int i = 0; i < list.size(); i++) {
            if(isOdd(list.get(i)))
                System.out.print(list.get(i) + ", ");
        }
        System.out.println("Number is Even: ");
        for (int i = 0; i < list.size(); i++) {
            if(isEven(list.get(i)))
                System.out.print(list.get(i) + ", ");
        }
        System.out.println("Number is Perfect Square: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(isPerfectSquare(list.get(i))+ ", ");
        }
            
        
        
    }
    public void Quadratic(){
        List<Float> q = new ArrayList<>();
        System.out.println("----- Calculate Quadratic Equation -----");
        float a = checkFloat("Enter A: ");
        float b = checkFloat("Enter B: ");
        float c = checkFloat("Enter C: ");
        float x1, x2;
        q.add(a);
        q.add(b);
        q.add(c);
        if(a == 0)
            calculateSEquation(b, c);
        else{
            float delta = b*b-4*a*c;
            if(delta < 0 ){
                System.out.println("No solution!");
            }
            if(delta == 0) x1= x2 = -b/(2*a);
            else{
                x1 = (-b-(float)Math.sqrt(delta))/(2*a);
                q.add(x1);
                x2 = (-b+(float)Math.sqrt(delta))/(2*a);
                q.add(x2);
                System.out.println("Solution: x1 = "+x1+", x2 = "+x2);
            }
            
        }
        System.out.println("Odd Number: ");
        for (int i = 0; i < q.size(); i++) {
            if(isOdd(q.get(i)))
                System.out.print(q.get(i) + ", ");
        }
        System.out.println("Number is Even: ");
        for (int i = 0; i < q.size(); i++) {
            if(isEven(q.get(i)))
                System.out.print(q.get(i) + ", ");
        }
        System.out.println("Number is Perfect Square: ");
        for (int i = 0; i < q.size(); i++) {
            System.out.print(isPerfectSquare(q.get(i))+ ", ");
        }
    }
}
