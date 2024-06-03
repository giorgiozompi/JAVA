import java.util.ArrayList;

public  abstract class User  {
    public  String firstname;
    public  String lastname;
    public  String email;
    public  int eta;
    public ArrayList <User> utenti=new ArrayList<>();

    public ArrayList<User> getUtenti() {
        return utenti;
    }

    public String getfirstname() {
        return firstname;
    }
    public String getlastname() {
        return lastname;
    }
    public String getEmail() {
        return email;
    }
    public int getEta() {
        return eta;
    }
    
    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public void setlastname(String lastname) {
        this.lastname = lastname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
   
   
    

public String toString(){
    return "firstname: "+this.firstname+" "+this.lastname+" eta: "+this.eta +" email: "+this.email;
}

    
}
