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

    static String code() {
        String code;
        do {
            code = v.checkString("Enter Code: ", "[w|W]\\s\\d+");
            if (m.checkCodeExist(code) == -1) {
                System.out.println("Code not exist!");
            } else {
                return code;
            }
        } while (true);

    }
    static Validation v = new Validation();
    static Manager m = new Manager();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("");
            System.out.println("======= Worker Management =======");
            System.out.println("1. Add Worker");
            System.out.println("2. Up salary");
            System.out.println("3. Down salary");
            System.out.println("4. Display Information salary");
            System.out.println("5. Exit");

            choice = v.checkInt("Enter your choice: ", 1, 5);
            switch (choice) {
                case 1:
                    m.addWorker(new Worker());
                    break;
                case 2:
                    String code = code();
                    double amount = v.checkSalary("Enter salary: ", Double.MAX_VALUE);
                    SalaryStatus ss = new SalaryStatus();
                    ss.setStatus("up");
                    m.changeSalary(ss, code, amount);
                    break;
                case 3:
                    String code1 = code();
                    double amount1 = v.checkSalary("Enter salary: ", m.list.get(m.checkCodeExist(code1)).getSalary());
                    SalaryStatus ss1 = new SalaryStatus();
                    ss1.setStatus("down");
                    m.changeSalary(ss1, code1, amount1);
                    break;
                case 4:
                    m.displayInfo();
            }
        } while (choice != 5);
    }

}
