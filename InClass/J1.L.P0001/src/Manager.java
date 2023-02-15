
import java.util.ArrayList;
import java.util.List;

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

    Validation v = new Validation();
    static List<Student> st = new ArrayList<>();

    public int checkIDExist(String id) {
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    public boolean checkYN() {
        String choice = v.checkString("", "[Y|y|N|n]");
        if (choice.charAt(0) == 'Y' || choice.charAt(0) == 'y') {
            return true;
        }
        return false;
    }

    public void addStudent() {
        do {
            String id;
            do {
                id = v.checkString("Enter ID: ", "[S|s][E|e]\\d{6}");
                if (checkIDExist(id) != -1) {
                    System.out.println("ID Existed!");
                } else {
                    break;
                }
            } while (true);
            String fname = v.checkString("Enter First Name: ", "[A-Z][a-z]+");
            String lname = v.checkString("Enter Last Name: ", "[A-Z][a-z]+(\\s[A-Z][a-z]+){0,2}");
            String gender = v.checkString("Enter Gender: ", ".*");
            String dOB = v.checkDate("Enter date of birth: ");
            String email = v.checkString("Enter email: ", "[A-Za-z]+\\d+@[a-z]+([.][a-z]+){1, 3}");
            String pNum = v.checkString("Enter phone number: ", "\\d{10,12}");
            st.add(new Student(id, fname, lname, gender, dOB, email, pNum));
            System.out.println("Do you want to add more student? (Y/N)");
            if (!checkYN()) {
                break;
            }
        } while (true);
    }

    public boolean updateStudent() {

        String id;

        id = v.checkString("Enter ID: ", "[S|s][E|e]\\d{6}");
        if (checkIDExist(id) == -1) {
            System.out.println("Student does not exist");
            return false;
        }
        return true;
    }
    public void grade(){
        do{
            String id;

        id = v.checkString("Enter ID: ", "[S|s][E|e]\\d{6}");
        if (checkIDExist(id) == -1) {
            System.out.println("Student does not exist");
        }
        else break;
        }while(true);
        do{
            String id;

        id = v.checkString("Enter ID: ", "[S|s][E|e]\\d{6}");
        if (checkIDExist(id) == -1) {
            System.out.println("Student does not exist");
        }
        else break;
        }while(true);
    }
}
