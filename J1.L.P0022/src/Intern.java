/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Intern extends Candidate{
    private String major;
    private int semester;
    private String uniName;

    public Intern() {
    }

    public Intern( String id, String fName, String lName, int dob, String address, String phone, String email, int type, String major, int semester, String uniName) {
        super(id, fName, lName, dob, address, phone, email, type);
        this.major = major;
        this.semester = semester;
        this.uniName = uniName;
    }

    public String getMajor() {
        return major;
    }

    public int getSemester() {
        return semester;
    }

    public String getUniName() {
        return uniName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }
    
}
