public class Main {
    public static void main(String[] args) {

        Repertoire repertoire = new Repertoire(10);

        repertoire.addAbonne(new Abonne("Mahmoud", "0799112233"));
        repertoire.addAbonne(new Abonne("Imene", "0650123456"));
        repertoire.addAbonne(new Abonne("Fatima", "0771122334"));
        repertoire.addAbonne(new Abonne("Youssef", "0555678910"));
        repertoire.addAbonne(new Abonne("Amina", "0798123456"));
        repertoire.addAbonne(new Abonne("Nabil", "0678987654"));
        repertoire.addAbonne(new Abonne("Sarah", "0777654321"));
        repertoire.addAbonne(new Abonne("Kamel", "0561112233"));
        repertoire.addAbonne(new Abonne("Karim", "0655123498"));
        repertoire.addAbonne(new Abonne("Hassan", "0798001122"));

        System.out.println("\nNuméro de Imene: " + repertoire.getNumero("Imene"));

        System.out.println("\nNombre d'abonnés: " + repertoire.getNAbonnes());

        System.out.println("\nLe nom de l'abonné numéro 2: " + repertoire.getAbonne(2).getNom());

        System.out.println("\nNoms des abonnés triés:");
        for (Abonne abonne : repertoire.getAbonnesTries()) {
            System.out.println(abonne.getNom());
        }

    }
}
