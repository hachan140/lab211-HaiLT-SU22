
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
    List<Candidate> cdd = new ArrayList<>();
    int checkIdExist(String id){
        for (int i = 0; i < cdd.size(); i++) {
            if(cdd.get(i).getId().equalsIgnoreCase(id))
                return i;
        }
         return -1;
    }
    int menu(){
        int choice;
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
        choice = v.checkInt("Enter your choice: ", 1, 5);
        return choice;
    }
    void addCandidate(int type){
        while(true){
        String id;
        while(true){
            id = v.checkString("Enter id: ", "\\d+");
            if(checkIdExist(id) == -1)
                break;
            else System.out.println("Candidate has been exist!");
        }
        String fName = v.checkString("Enter first name: ", "[a-z]+");
        String lName = v.checkString("Enter last name: ", "[a-z]+");
        int dob = v.checkInt("Enter birthdate: ", 1900, Calendar.getInstance().get(Calendar.YEAR));
        String address = v.checkString("Enter address: ", ".*");
        String phone = v.checkString("Enter phone number: ", "\\d{10}\\d*");
        String email = v.checkString("Enter your email: ", "[a-zA-Z]+\\d*@([a-z]+[.]){2}[a-z]+");

        Candidate c = new Candidate(id, fName, lName, dob, address, phone, email, type);
        switch(type){
            case 0:
                addExperience(c);
                break;
            case 1:
                addFresher(c);
                break;
            case 2:
                addIntern(c);
                break;
        }
        if(!v.checkYN("Do you want to continue: (y/n)?")) break;
        }
        
    }
    void addExperience(Candidate c){
        int yearOfExp = v.checkInt("Enter year of Experience: ", 0, Integer.MAX_VALUE);
        String proSkill = v.checkString("Enter your professional skill: ", ".*");
        Candidate exp = new Experience(c.getId(), c.getfName(), c.getlName(), c.getDob(), c.getAddress(), c.getPhone(),c.getEmail() , c.getType(), yearOfExp, proSkill);
        cdd.add(c);
    }
    void addFresher(Candidate c){
        Date d = v.checkDate("Enter graduated time: ", "dd/mm/yyyy");
        String graRank = v.checkInputGraduationRank("Enter Graduatation Rank: ");
        String university = v.checkString("Enter University: ", ".*");
        Candidate fr = new Fresher(c.getId(), c.getfName(), c.getlName(), c.getDob(), c.getAddress(), c.getPhone(),c.getEmail() , c.getType(), d, graRank, university);
        cdd.add(fr);
    }
    void addIntern(Candidate c){
        String major = v.checkString("Enter your major: ", ".*");
        int sem = v.checkInt("Enter your semester: ", 1, 9);
        String university = v.checkString("Enter University: ", ".*");
        Candidate it = new Intern(c.getId(), c.getfName(), c.getlName(), c.getDob(), c.getAddress(), c.getPhone(),c.getEmail() , c.getType(), major, sem, university);
        cdd.add(it);       
    }
    void search(){
        int count = 0;
        System.out.println("List of candidate: ");
        System.out.println("=======EXPERIENCE CANDIDATE========");
       
        for (int i = 0; i < cdd.size(); i++) {
            if(cdd.get(i) instanceof Experience){
                System.out.println(cdd.get(i).getfName()+" "+ cdd.get(i).getlName());
            }
        }
        System.out.println("=======FRESHER CANDIDATE========");
        for (int i = 0; i < cdd.size(); i++) {
            if(cdd.get(i) instanceof Fresher){
                System.out.println(cdd.get(i).getfName()+" "+ cdd.get(i).getlName());
            }
        }
            System.out.println("=======INTERN CANDIDATE========");
        for (int i = 0; i < cdd.size(); i++) {
            if(cdd.get(i) instanceof Intern){
                System.out.println(cdd.get(i).getfName()+" "+ cdd.get(i).getlName());
            }
        }
        String name = v.checkString("Input Candidate name (First name or Last name): ", "[a-z]+");
        int type = v.checkInt("Enter type of candidate: ", 0, 2);
        for (Candidate candidate : cdd) {
            if((candidate.getfName().equalsIgnoreCase(name) || candidate.getlName().equalsIgnoreCase(name)) && candidate.getType() == type){
                System.out.println(candidate);
                count++;
            }
        }
        if(count == 0){
            System.out.println("Not Found!");
        }
    }
    
}
