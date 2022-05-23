/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Student {
    private String name;
    private String className;
    private double math;
    private double physical;
    private double chemistry;
    private double avg;
    private char type;
    public Student() {
    }

    public Student(String name, String className, double math,  double chemistry,double physical, double avg, char type) {
        this.name = name;
        this.className = className;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
        this.avg = avg;
        this.type = type;
    }

    

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public double getMath() {
        return math;
    }

    public double getAvg() {
        return avg;
    }

    public double getPhysical() {
        return physical;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getType() {
        return type;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    
    
}
