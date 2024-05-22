public class Menu {
    public static void main(String[] args) {
    Piattospeciale piattospeciale = new Piattospeciale();
    System.out.println("Ecco la lista degli ingredienti: ");
    piattospeciale.elencoPubblico();
   
    
    
   piattospeciale.elenco();
   System.out.println(piattospeciale.getIngredienti2());
   piattospeciale.somma(piattospeciale.getIngredienti2());
   System.out.println("il totale è "+ piattospeciale.somma + " $");
    }
    
}
