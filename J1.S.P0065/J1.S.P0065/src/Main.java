
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class Main {

    static Scanner sc = new Scanner(System.in);

    static String checkString(String regex, String msg) {
        
        while (true) {
            System.out.print(msg);
            String word = sc.nextLine();
            if (word.isEmpty()) {
                System.out.print("Empty!");
            } else {
                if(word.matches(regex)){
                    return word;
                    
                }
                else System.out.println("Invalid value, re-enter!");
                continue;
            }
        }
    }

    static double checkDouble(String nameSub) {
        while (true) {
            try {
                double d = Double.parseDouble(sc.nextLine());
                if (d <= 0) {
                    System.out.println(nameSub + " is greater than equal zero");
                    continue;
                }
                if(d > 10){
                    System.out.println(nameSub + " is less than equal ten");
                    continue;
                }  
                return d;
            } catch (Exception e) {
                System.out.println(nameSub+ " is digit");
            }
        }
    }

    static boolean checkYN() {
        while (true) {
            String result = checkString(".", "");
            if (result.length() == 1) {
                char c = result.charAt(0);
                if (c == 'y' || c == 'Y') {
                    return true;
                }
                if (c == 'n' || c == 'N') {
                    return false;
                }
            }
            System.err.println("Re-input");
        }

    }

    static void createStudent(List<Student> l) {
        System.out.println("====== Management Student Program ======");
        while (true) {
            
            String name = checkString("[A-Za-z][a-z]+(\\s[A-Za-z][a-z]+){0,3}", "Name: ");  
           
            String classes = checkString("[s|S][e|E]\\d+", "Classes: ");
            System.out.print("Maths: ");
            double math = checkDouble("Maths");
            System.out.print("Chemistry: ");
            double chem = checkDouble("Chemistry");
            System.out.print("Physics: ");
            double physic = checkDouble("Physics");
            double avg = (math+chem+physic)/3.0;
            char type;
            if(avg > 7.5)
                type = 'A';
            else if(avg >= 6 && avg <= 7.5)
                type = 'B';
            else if(avg >=4 && avg <=6)
                type = 'C';
            else type = 'D';
            l.add(new Student(name, classes, math, chem, physic,avg, type));
            System.out.println("Do you want to enter more student information?(Y/N)");
            if(!checkYN())
                return;
        }
    }
    static void displayInfo(List<Student> l){
        for (int i = 0; i < l.size(); i++) {
            System.out.println("------ Student" + (i+1) +" Info ------");
            System.out.println("Name: " + l.get(i).getName());
            System.out.println("Classes: " + l.get(i).getClassName());
            System.out.println("AVG: " + l.get(i).getAvg());
            System.out.println("Type: " + l.get(i).getType());
        }
    }
    static HashMap<String, Double> getPercentTypeStudent(List<Student> students){
        HashMap<String, Double> getPercentTypeStudent = new HashMap<>();
        int total = students.size();
        double tA = 0, tB = 0, tC = 0, tD = 0;
        for (int i = 0; i < total; i++) {
            if(students.get(i).getType() == 'A')
                tA++;
            else if(students.get(i).getType() == 'B')
                tB++;
            else if(students.get(i).getType() == 'C')
                tC++;
            else
                tD++;
            
            
    }
            getPercentTypeStudent.put("A", tA/total *100);
            getPercentTypeStudent.put("B", tB/total *100);
            getPercentTypeStudent.put("C", tC/total *100);
            getPercentTypeStudent.put("D", tD/total *100);
        return getPercentTypeStudent;
    }
        static void displayHM(HashMap<String, Double> hm){
            System.out.println("--------Classification Info -----");
        
            for (Map.Entry<String, Double> entry : hm.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue()+ "%");
                
            }
        }
        
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();
        createStudent(l);
        displayInfo(l);
        HashMap<String, Double> hm = getPercentTypeStudent(l);
        displayHM(hm);
    }
}
