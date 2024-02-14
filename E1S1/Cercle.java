public class Cercle {

    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public void deplaceCentre(double dx, double dy) {
        centre.deplace(dx, dy);
    }

    public void changeRayon(double rayon) {
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void affiche() {
        System.out.print("Centre du cercle: ");
        centre.affiche();
        System.out.println("Rayon du cercle: " + rayon);
    }

}
