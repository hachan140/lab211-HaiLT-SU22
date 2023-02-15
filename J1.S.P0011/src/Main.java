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
    static Validation v = new Validation();
    static Manager m = new Manager();
    public static void main(String[] args) {
        
        //menu in
        System.out.println("Choose the base input: ");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
        int in = v.checkInt("Your choice: ", 1, 3);
        System.out.println("Choose the base output: ");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
        int out;
        do{
             out = v.checkInt("Your choice: ", 1, 3);
             if(out == in) System.out.println("Invalid choice!");
        }while(out== in);
        if(in == 1){
            String num = v.checkInput("Enter number to change base: ", "[0|1]+");
            if(out == 2){
                System.out.println(m.changeOrgtoDec(num, 2));               
            }
            if(out == 3){
                int toDec = m.changeOrgtoDec(num, 2);
                System.out.println(m.changeDec(toDec, 16));
                
            }
        }
        if(in == 2){
            String num = v.checkInput("Enter number to change base: ", "\\d+");
            int n = Integer.parseInt(num);
            if(out == 1){
                System.out.println(m.changeDec(n, 2));
            }
            if(out == 3){
                System.out.println(m.changeDec(n, 16));
            }
        }
        if(in == 3){
            String num = v.checkInput("Enter number to change base: ", "[0-9a-fA-F]+");
            if(out == 1){
                int n = m.changeOrgtoDec(num, 10);
                System.out.println(m.changeDec(n, 2));
            }
            if(out == 2){
                System.out.println(m.changeOrgtoDec(num, 16));
            }
        }
       
    }
}
