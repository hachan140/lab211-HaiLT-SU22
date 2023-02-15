
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
    static String hex = "0123456789abcdef";
    public String changeDec(int n, int base) {
        String num = "";
        while(n > 0){
            int tmp = n%base;
            num = hex.charAt(tmp) + num ;
            n = n/base;
        }
        return num;
    }

    public int changeOrgtoDec(String org, int base) {
        org.toLowerCase();
        int result = 0;
        for (int i = 0; i < org.length(); i++) {
            char c = org.charAt(i);
            int num = hex.indexOf(c);
            result = num + base*result;
        }
        return result;
    }
}
