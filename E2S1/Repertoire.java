import java.util.Arrays;

public class Repertoire {

    private int taille;
    private Abonne[] abonnes;

    private int indiceCourant = 0;

    public Repertoire(int taille) {
        this.taille = taille;
        this.abonnes = new Abonne[taille];
    }

    public boolean addAbonne(Abonne abonne) {
        /*
         * for (int i = 0; i < taille; i++) {
         * if (abonnes[i] == null) {
         * abonnes[i] = abonne;
         * return true;
         * }
         * }
         * return false;
         */

        if (indiceCourant < taille) {
            abonnes[indiceCourant] = abonne;
            indiceCourant++;

            return true;
        }

        return false;
    }

    public String getNumero(String nom) {
        for (int i = 0; i < taille; i++) {
            if (abonnes[i] != null && abonnes[i].getNom().equals(nom)) {
                return abonnes[i].getNumero();
            }
        }
        return null;
    }

    public int getNAbonnes() {
        int n = 0;
        for (int i = 0; i < taille; i++) {
            if (abonnes[i] != null) {
                n++;
            }
        }
        return n;
    }

    public Abonne getAbonne(int i) {
        if (i >= 0 && i < taille) {
            return abonnes[i];
        }
        return null;
    }

    public Abonne[] getAbonnesTries() {
        Abonne[] abonnesTries = Arrays.copyOf(abonnes, getNAbonnes());

        Arrays.sort(abonnesTries, (a1, a2) -> a1.getNom().compareTo(a2.getNom()));

        return abonnesTries;
    }

}
