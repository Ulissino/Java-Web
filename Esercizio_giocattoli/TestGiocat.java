package Esercizio_giocattoli;

import java.util.ArrayList;

public class TestGiocat{
    public static void main(String[] args) {

        //dichiariamo le nostre liste
        ArrayList <Vendita> v = new ArrayList<>(); 
        ArrayList <Giocattolo> g = new ArrayList<>(); 
        ArrayList <Cliente> c = new ArrayList<>(); 
        
        //aggiungiamo i giocattoli alla nostra lista
        g.add(new Giocattolo(0, "Asinello", 12.50, 10));
        g.add(new Giocattolo(1, "Moto", 5.50, 3));

        //aggiungiamo i clienti
        c.add(new Cliente(0, "Ivan", "nonloso@gmail.com"));
        c.add(new Cliente(1, "Sergio", "nonloso24@gmail.com"));

        //assegnamo i clienti ai giocattoli
        v.add(new Vendita(g.get(0), c.get(1)));

       System.out.println(v.toString());
    }
}