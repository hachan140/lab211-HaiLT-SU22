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
   
    
    public static void main(String[] args) {
        System.out.println("====== Validate Program ======");
        String pnum = Validation.checkPhone("Phone number: ", "[0-9]{10}");
        String email = Validation.checkPhone("Email: ", "[A-Za-z]\\w+@\\w+(\\.\\w+){1,3}");
        String date = Validation.checkDate("Date: ", "dd/mm/yyyy");
    }
}
