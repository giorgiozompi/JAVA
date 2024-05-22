import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
    Piattospeciale piattospeciale = new Piattospeciale();
    System.out.println("Ecco la lista degli ingredienti: ");
    piattospeciale.elencoPubblico();
    boolean scelta=true;
   
    
    
    
    piattospeciale.elenco();
    System.out.println(piattospeciale.getIngredienti2());
    piattospeciale.somma(piattospeciale.getIngredienti2());
    System.out.println("il totale è "+ piattospeciale.somma + " $");
   while(scelta){
    System.out.println("premere 1 per ordinare un altro piatto, 2 per terminare ");
    Scanner myObj=new Scanner(System.in);
    int ing=myObj.nextInt();
    if(ing==1){
        piattospeciale.elenco();
   System.out.println(piattospeciale.getIngredienti2());
   piattospeciale.somma(piattospeciale.getIngredienti2());
   System.out.println("il totale è "+ piattospeciale.somma + " $");

    }
    else{
       scelta=false; 
    }
    }
    
}}
