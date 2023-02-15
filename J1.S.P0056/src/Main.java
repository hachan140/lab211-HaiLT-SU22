
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

    static Manager manager = new Manager();
    static Validation v = new Validation();

    static void menu() {
        int choice = 0;
        System.out.println("======= Worker Management =======");
        do {
            System.out.println("1. Add Worker" + ""
                    + "\n2. Up salary"
                    + "\n3. Down salary"
                    + "\n4. Display Information salary"
                    + "\n5. Exit");
            choice = checkChoice("Enter choice(1-5): ");
            switch (choice) {
                case 1:
                    manager.addWorker(new Worker());
                    break;
                case 2:
                    String code;
                    do {
                        code = v.checkString("Enter Code: ", "[W|w]\\s\\d");
                        if (manager.checkCodeExist(code) == -1) {
                            System.out.println("Code not Exist!");

                        } else {
                            break;
                        }
                    } while (true);
                    SalaryStatus ss = new SalaryStatus();
                    ss.setStatus("UP");
                    double amount = v.checkSalary("Enter Salary: ", Double.MAX_VALUE);
                    if (manager.changeSalary(ss, code, amount)) {
                        System.out.println("Update successfully!");
                        break;
                    }
                case 3:
                    String code1;
                    do {
                        code1 = v.checkString("Enter Code: ", "[W|w]\\s\\d");
                        if (manager.checkCodeExist(code1) == -1) {
                            System.out.println("Code not Exist!");

                        } else {
                            break;
                        }
                    } while (true);
                    SalaryStatus ss1 = new SalaryStatus();
                    ss1.setStatus("down");
                    double amount1 = v.checkSalary("Enter Salary: ", manager.list.get(manager.checkCodeExist(code1)).getSalary());
                    if (manager.changeSalary(ss1, code1, amount1)) {
                        System.out.println("Update successfully!");
                        break;
                    }
                case 4:
                    System.out.println("-------------Display Information Salary-------------");
                    System.out.printf("%-5s%-10s%-5s%-10s%-10s%s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
                    for (SalaryHistory sl : manager.getInfomationSalary()) {
                        System.out.println(sl.toString());
                    }
                    break;
            }
        } while (choice >= 1 && choice <= 4);

    }

    static Scanner sc = new Scanner(System.in);

    static int checkChoice(String msg) {

        while (true) {
            try {
                System.out.print(msg);
                int c = Integer.parseInt(sc.nextLine());
                if (c >= 1 && c <= 5) {
                    return c;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Invalid choice, must be between 1 and 5");
            }
        }
    }

    public static void main(String[] args) {
        manager.database();
        menu();
        
    }

}
