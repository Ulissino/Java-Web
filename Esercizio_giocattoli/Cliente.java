package Esercizio_giocattoli;

public class Cliente {
    
    int id;
    private String nome;
    private String indirizzo_email;

    public Cliente(int id, String nome, String indirizzo_email){
        this.id = id;
        this.nome = nome;
        this.indirizzo_email = indirizzo_email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIndirizzo_email(String indirizzo_email) {
        this.indirizzo_email = indirizzo_email;
    }

    public String getIndirizzo_email() {
        return indirizzo_email;
    }

    @Override
    public String toString(){
       return "Nome Cliente: " + nome + " Indirizzo email: " + indirizzo_email;
    }
}
