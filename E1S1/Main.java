public class Main {
    public static void main(String[] args) {

        // Test de classe Point

        System.out.println("\n--------------------------------------------------------");

        System.out.println("\nTEST DE LA CLASSE Point:\n");

        Point point = new Point(5, 8);

        System.out.println("Affichage avant déplacement:");
        point.affiche();

        point.deplace(2, 3);

        System.out.println("\nAffichage après déplacement:");
        point.affiche();

        System.out.println("\n--------------------------------------------------------");

        // Test de classe Cercle

        System.out.println("\nTEST DE LA CLASSE Cercle:\n");

        Cercle cercle = new Cercle(point, 5);

        System.out.println("Affichage avant déplacement et changement de rayon:");
        cercle.affiche();

        cercle.deplaceCentre(2, 3);

        System.out.println("\nAffichage après déplacement:");
        cercle.affiche();

        cercle.changeRayon(10);

        System.out.println("\nAffichage après changement de rayon:");
        cercle.affiche();

        System.out.println("\n--------------------------------------------------------");

        // Test de la classe Cercle2

        System.out.println("\nTEST DE LA CLASSE Cercle2:\n");

        Cercle2 cercle2 = new Cercle2(5, 8, 5);

        System.out.println("Affichage avant déplacement et changement de rayon:");
        cercle2.affiche();

        cercle2.deplaceCentre(2, 3);

        System.out.println("\nAffichage après déplacement:");
        cercle2.affiche();

        cercle2.changeRayon(10);

        System.out.println("\nAffichage après changement de rayon:");
        cercle2.affiche();

        System.out.println("\n--------------------------------------------------------");

    }
}