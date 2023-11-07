package Esercizio_giocattoli;

public class Giocattolo {
    int id;
    String nome;
    double prezzo;
    int eta_cons;

    public Giocattolo(int id, String nome, double prezzo, int eta_cons){
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.eta_cons = eta_cons;
    }

    @Override
    public String toString(){
        return "Giocattolo " + nome + " " + "prezzo: " + prezzo + " " + "Età consigliata " + eta_cons;
    }
}
