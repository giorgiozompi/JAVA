
    

import java.util.ArrayList;
import java.util.Scanner;

public class Pannacotta2 {
public String nome;
public ArrayList<String> ingredienti= new ArrayList<>();
public ArrayList<String> ingredienti2= new ArrayList<>();
public double prezzo;
public boolean scelta=true;
public ArrayList<String> getIngredienti2() {
    return ingredienti2;
}
public ArrayList<String> getIngredienti() {
     return ingredienti;
 }
 public String getNome() {
     return nome;
 }
 public double getPrezzo() {
     return prezzo;
 }
  public void setIngredienti(ArrayList<String> ingredienti) {
      this.ingredienti = ingredienti;
  }
  public void setNome(String nome) {
      this.nome = nome;
  }
  public void setPrezzo(double prezzo) {
      this.prezzo = prezzo;
  }
  public void aggiunta2(){
    ingredienti2.add("latte");
    ingredienti2.add("colla di pesce");
    ingredienti2.add("vaniglia");
  }
  
  public void aggiunta(ArrayList<String> ingredienti, ArrayList<String> ingredienti2){
 
  while(scelta){
  System.out.println("Scegli un ingrediente(scegli un numero non presente nell'elenco per terminare): ");
  System.out.println("[1] " + ingredienti2.get(0));
  System.out.println("[2] " + ingredienti2.get(1));
  System.out.println("[3] " + ingredienti2.get(2));
  Scanner myObj=new Scanner(System.in);
  int ing=myObj.nextInt();
  
 switch (ing) {
   
  
    case 1:
    ingredienti.add(ingredienti2.get(0));
        break;
        case 2:
    ingredienti.add(ingredienti2.get(1));
        break;
        case 3:
    ingredienti.add(ingredienti2.get(2));
        break;
    default:
    System.out.println(ingredienti);
    scelta=false;
        break;
  }
  }
  }  
  
}

