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
        int choice;
        do{
        choice = m.menu();
        switch(choice){
            case 1:
                m.addCandidate(0);
                break;
            case 2:
                m.addCandidate(1);
                break;
            case 3:
                m.addCandidate(2);
                break;
            case 4:
                m.search();
                break;               
        }
        }while(choice!=5);
    }
}
