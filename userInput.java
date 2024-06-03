import java.util.ArrayList;
import java.util.Scanner;

public class userInput extends User {
    
    
  
  
    public  userInput(String nome,String cognome,String email,int eta){
        this.firstname=nome;
        this.lastname=cognome;
        this.email=email;
        this.eta=eta;
    }
 


public static User createUser(){
    Scanner myObj=new Scanner(System.in);
    Scanner scani=new Scanner(System.in);
    
    System.out.println("nome: ");
   // setfirstname(myObj.nextLine());
    String firstname=myObj.nextLine();
    System.out.println("cognome: ");
    //setlastname(myObj.nextLine());
    String lastname=myObj.nextLine();
    System.out.println("email: ");
   // setEmail(myObj.nextLine());
    String email=myObj.nextLine();
    System.out.println("età: ");
    int eta=myObj.nextInt();
   // setEta(myObj.nextInt());
    User utente=new userInput(firstname, lastname, email, eta);
    return utente;
}
}
