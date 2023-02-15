
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

    public static Scanner sc = new Scanner(System.in);
    static Manager m = new Manager();
    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("========= Equation Program ========");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");

            while (true) {
                try {
                    System.out.print("Enter your choice: ");
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice >= 1 && choice <= 3) {
                        break;
                    } else {
                        System.out.println("You must choose one of three options!");
                    }
                } catch (Exception e) {
                    System.out.println("Input a number!");
                }
            }
            switch(choice){
                case 1:
                    m.inputSuperlative();
                    m.calculateSEquation(choice, choice);
            }
        } while (choice != 3);

    }
}
