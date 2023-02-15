/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
   public double getPerimeter(){
        return getSideA()+getSideB()+getSideC();
    }
    public double getArea(){
        double p = getSideA()+getSideB()+getSideC();
        return Math.sqrt(p*(p-getSideA())*(p-getSideB())*(p-getSideC()));
    }
    public void printResult(){
        System.out.println("-----Triangle-----");
        System.out.println("Side A: " + getSideA());
        System.out.println("Side B: " + getSideB());
        System.out.println("Side C: "+ getSideC());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
