import java.util.ArrayList;
import java.util.Scanner;
public class Fabbrica2 {
    public static void main(String[] args) {
        Pannacotta2 pannacotta = new Pannacotta2();
        Pannacottafrutta2 pannacottafrutta = new Pannacottafrutta2();
        Pannacottacioccolato2 pannacottacioccolato = new Pannacottacioccolato2();
        int somma=0;
        pannacotta.aggiunta2();
        pannacottafrutta.aggiunta3();
        pannacottacioccolato.aggiunta4();
       
        System.out.println("le nostre pannecotte sono fatte con: "+ pannacotta.getIngredienti2());
        System.out.println("L'elenco delle pannecotte si divide in frutta e cioccolato, nello specifico puoi aggiungere la seguente frutta: "+pannacottafrutta.getFrutta2());
        System.out.println("Oppure cioccolato con le seguenti percentuali di cacao: "+pannacottacioccolato.getCioccolato2());
        System.out.println("Premi 1 per una pannacotta alla frutta e 2 per una al cioccolato ");
        Scanner myObj2=new Scanner(System.in);
        int scelta=myObj2.nextInt();
        if(scelta==1){
            pannacotta.aggiunta(pannacottafrutta.frutta,pannacottafrutta.frutta2);
        }
        else if (scelta==2){
pannacotta.aggiunta(pannacottacioccolato.cioccolato,pannacottacioccolato.cioccolato2);}        
if(pannacottafrutta.frutta.contains("fragole - 2$")){
    somma+=2;
}
if(pannacottafrutta.frutta.contains("lampone - 3$")){
    somma+=3;
}
if(pannacottafrutta.frutta.contains("fragole - 4$")){
    somma+=4;
}
if(pannacottacioccolato.cioccolato.contains("cioccolato fondente al 25% - 2$")){
    somma+=2;
}
if(pannacottacioccolato.cioccolato.contains("cioccolato fondente al 35% - 3$")){
    somma+=3;
}
if(pannacottacioccolato.cioccolato.contains("cioccolato fondente al 50% - 4$")){
    somma+=4;
}
System.out.println("Il totale è "+ somma + "$");
    }
   
    
}

