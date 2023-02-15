
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

    static int menu() {
        System.out.println("========= Doctor Management =========");
        System.out.println("   1. Add Doctor");
        System.out.println("   2. Update Doctor");
        System.out.println("   3. Delete Doctor");
        System.out.println("   4. Search Doctor");
        System.out.println("   5. Exit");
        int choice = Validation.checkChoice(1, 5);
        return choice;
    }

    static void addDoctor(List<Doctor> ld) {
        System.out.println("--------- Add Doctor ---------");

        String code = Validation.checkString("Enter Code: ", "[D|d][o][c]\\d++");
        if (!Validation.checkCodeExist(ld, code)) {
            return;
            System.out.println("Code exist");
        }

        String name = Validation.checkString("Enter Name: ", "[A-Za-z][a-z]+(\\s[A-Za-z][a-z]+){0,3}");
        String special = Validation.checkString("Enter Specialization: ", "[A-Za-z]");
        int aval = Validation.checkInt("Enter Availability: ");
        ld.add(new Doctor(code, name, special, aval));

    }

    static void updateDoctor(List<Doctor> ld) {
        System.out.println("--------- Update Doctor ---------");

        String code = Validation.checkString("Enter Code: ", "[D|d][o][c]\\d++");
        if (Validation.checkCodeExist(ld, code)) {
            System.out.println("Doctor does not exist!");
            return;
        }
        Doctor d = getDoctorByCode(ld, code);
        String name, special;
        int aval;
        
        if(Validation.checkYN("Update Name (Y/N)?: ")){
           name = Validation.checkString("Enter Name: ", "[A-Za-z][a-z]+(\\s[A-Za-z][a-z]+){0,3}");
           d.setName(name);
        }
        
        if(Validation.checkYN("Update Special (Y/N)?: ")){
             special = Validation.checkString("Enter Specialization: ", "[A-Za-z]");
             d.setSpecialization(special);
        }
        if(Validation.checkYN("Update Availability (Y/N)?: ")){
           aval = Validation.checkInt("Enter Availability: ");
           d.setAvailability(aval);
        }

       
        
    }

    static Doctor getDoctorByCode(List<Doctor> l, String code) {
        for (Doctor d : l) {
            if (d.getCode().equalsIgnoreCase(code)) {
                return d;
            }
        }
        return null;
    }

    static void deleteDoctor(List<Doctor> l) {
        System.out.println("------- Delete Doctor -------");
        String code = Validation.checkString("Enter Code: ", "[D|d][o][c]\\d++");
        if (Validation.checkCodeExist(l, code)) {
            System.out.println("Doctor does not exist!");
            return;
        }
        Doctor d = getDoctorByCode(l, code);
        l.remove(d);
    }

    static void searchDoctor(List<Doctor> l) {
        System.out.println("---------- Search Doctor ----------");

        String name = Validation.checkString("Enter text: ", "[A-Za-z][a-z]+(\\s[A-Za-z][a-z]+){0,3}");
        System.out.println("--------- Result ------------------");
        System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name", "Specialization", "Availability");
        for (Doctor doctor : l) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                        doctor.getName(), doctor.getSpecialization(), doctor.getAvailability());
            }
        }
    }
}
