public class Abonne {

    private String nom;
    private String numero;

    public Abonne(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
