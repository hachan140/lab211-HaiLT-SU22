
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Fresher extends Candidate {
    private Date date;
    private String graRank;
    private String university;

    public Fresher() {
    }

    public Fresher( String id, String fName, String lName, int dob, String address, String phone, String email, int type, Date date, String graRank, String university) {
        super(id, fName, lName, dob, address, phone, email, type);
        this.date = date;
        this.graRank = graRank;
        this.university = university;
    }

    public Date getDate() {
        return date;
    }

    public String getGraRank() {
        return graRank;
    }

    public String getUniversity() {
        return university;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setGraRank(String graRank) {
        this.graRank = graRank;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
}
