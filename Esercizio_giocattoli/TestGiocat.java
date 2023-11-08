package Esercizio_giocattoli;

import java.util.ArrayList;
import java.util.Scanner;



public class TestGiocat{

    final static String username = "Ivan20";
    final static String pass = "12345";

    public static void main(String[] args) {

        //dichiariamo le nostre liste
        ArrayList <Vendita> v = new ArrayList<>(); 
        ArrayList <Giocattolo> g = new ArrayList<>(); 
        ArrayList <Cliente> c = new ArrayList<>();
        Inventario inventario = new Inventario();

        Scanner sc = new Scanner(System.in);

        /* 
        //aggiungiamo i giocattoli alla nostra lista
        g.add(new Giocattolo(0, "Asinello", 12.50, 10));
        g.add(new Giocattolo(1, "Moto", 5.50, 3));

        //aggiungiamo i clienti
        c.add(new Cliente(0, "Ivan", "nonloso@gmail.com"));
        c.add(new Cliente(1, "Sergio", "nonloso24@gmail.com"));

        //assegnamo i clienti ai giocattoli
        v.add(new Vendita(g.get(0), c.get(1)));

       System.out.println(v.toString());
       */

       System.out.println("Inserisci username: ");
       String user = sc.nextLine();

       System.out.println("Inserisci password: ");
       String pas = sc.nextLine();

       if (user.equals(username) && pas.equals(pass) ) {
        System.out.println("------MENù------");
        System.out.println("1) Aggiungi il giocattolo nell'inventario");
        System.out.println("2) Rimuovi il giocattolo dell'inventario");
        System.out.println("3) Visualizza il giocattolo nell'inventario");
        System.out.println("4) Esci");
        System.out.println("-------------------------------");
        int risp = sc.nextInt();

        switch (risp) {
            case 1:
                inventario.aggiungiGiocattolo();
                System.out.println("---------------");
                inventario.visualizzaDati();
                break;

            case 2:
                inventario.visualizzaDati();
                System.out.println("---------------");
                inventario.rimuoviGiocattolo();
                System.out.println("---------------");
                inventario.visualizzaDati();
                break;
            
            case 3:
                inventario.visualizzaDati();
                break;

            case 4:
                break;
        }
       }else{
        System.out.println("-----SEI UN UTENTE-----");
        inventario.visualizzaDati();
       }




    }
}