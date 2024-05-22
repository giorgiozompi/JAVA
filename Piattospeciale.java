import java.util.ArrayList;
import java.util.Scanner;

public class Piattospeciale {
public ArrayList<String> ingredienti= new ArrayList<>();
private ArrayList<String> ingredienti2= new ArrayList<>();
public ArrayList<Piattospeciale> lista= new ArrayList<>();
public String ing;
public double prezzo;
public double a=1.5,b=2,c=0.5,d=0.5,e=0.75;
public boolean scelta=true;
public double somma=1;


public ArrayList<String> getIngredienti2() {
    return ingredienti2;
}
public void setIngredienti2(ArrayList<String> ingredienti2) {
    this.ingredienti2 = ingredienti2;
}

public void elencoPubblico(){
ingredienti.add("[a] pane - "+ a);
ingredienti.add("[b] hamburger - "+ b);
ingredienti.add("[c] ketchup - "+ c);
ingredienti.add("[d] mayo - "+ d);
ingredienti.add("[e] cipolla - "+ e);
System.out.print(ingredienti);
}
public void elenco(){
    int i=0;
    while (scelta=true && i<ingredienti.size()){
    
        System.out.println("Inserire la lettera corrispondente all'ingrediente,inserire z per terminare ");
        System.out.println("Il prezzo di base è 1$ ");
        Scanner myObj=new Scanner(System.in);
        ing=myObj.nextLine();
        if (ing.equals("z")){
            scelta=false;
            break;
        }else{
        ingredienti2.add(ing);}
        i++;

    }
    }
public double somma(ArrayList Ingredienti2){
    
    if(Ingredienti2.contains("a")){
    somma+=a;
    }
    if(Ingredienti2.contains("b")){
     somma+=b;
     }
     if(Ingredienti2.contains("c")){
         somma+=c;
     }
     if(Ingredienti2.contains("d")){
     somma+=d;
     }
     if(Ingredienti2.contains("e")){
     somma+=e;
     }
     return somma;
}


    
}

    

