/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
     public double getPerimeter(){
        return getRadius()*3.14*2;
        
    }
    @Override
     public double getArea(){
         return getRadius()*getRadius()*3.14;
     }
     public void printResult(){
         System.out.println("-----Circle-----");
         System.out.println("Radius: " + getRadius());
         System.out.println("Area: " + getArea());
         System.out.println("Perimeter: " + getPerimeter());
     }
     
}
