package Esercizio_giocattoli;

public class Vendita {
    
    Giocattolo giocattolo;
    Cliente cliente;

    public Vendita(Giocattolo giocattolo, Cliente cliente){
        this.cliente= cliente;
        this.giocattolo = giocattolo;
    }

    public String toString(){
        return giocattolo.toString() +" "+ cliente.toString();
    }
}
