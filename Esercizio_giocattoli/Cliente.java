package Esercizio_giocattoli;

public class Cliente {
    
    int id;
    private String nome;
    private String indirizzo_email;
    private String password;
    private String username;

    public Cliente(int id, String nome, String indirizzo_email, String username, String password){
        this.id = id;
        this.nome = nome;
        this.indirizzo_email = indirizzo_email;
        this.password = password;
        this.username = username;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString(){
       return "Nome Cliente: " + nome + " Indirizzo email: " + indirizzo_email;
    }
}
