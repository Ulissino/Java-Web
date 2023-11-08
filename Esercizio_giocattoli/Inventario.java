package Esercizio_giocattoli;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    
    ArrayList<Giocattolo> g = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void aggiungiGiocattolo(){

        //inseriamo i dati del giocattolo
        System.out.println("Inserisci l'id del giocattolo");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.println("Inserisci il nome del giocattolo");
        String nome = sc.nextLine();

        System.out.println("Inserisci il prezzo del giocattolo");
        double prezzo = sc.nextDouble();

        System.out.println("Inserisci l'età consigliata");
        int eta_consigliata = sc.nextInt();

        //aggiungiamo il giocattolo all'interno dell'array
        g.add(new Giocattolo(id, nome, prezzo, eta_consigliata));
    }

    public void rimuoviGiocattolo(){

        System.out.println("Inserisci l'id del giocattolo da rimuovere");
        int idrim = sc.nextInt();

        //eseguo un ciclo for per scorrere l'array e trovare l'id da rimuovere
        for (int i = 0; i < g.size(); i++) {
            if (g.get(i).id == idrim) {
                g.remove(i);
                break; //faccio il break in modo tale che quando si trova l'id del giocattolo lo rimuove e non continua il programma 
            }
        }
    }

    public void acquistaGiocattolo(int idrim){
        for (int i = 0; i < g.size(); i++) {
            if (g.get(i).id == idrim) {
                g.remove(i);
                break; //faccio il break in modo tale che quando si trova l'id del giocattolo lo rimuove e non continua il programma 
            }
        }
    }

    public void visualizzaDati(){
        for (int i = 0; i < g.size(); i++) {

            System.out.println("Visualizzazione del prodotto");
            System.out.println("ID giocattolo: "+ g.get(i).id);
            System.out.println("Nome giocattolo: "+ g.get(i).nome);
            System.out.println("Prezzo giocattolo: "+ g.get(i).prezzo);
            System.out.println("Eta consigliata: "+ g.get(i).eta_cons);
        }
    }
}
