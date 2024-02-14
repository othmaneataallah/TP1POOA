public class Cercle2 extends Point {

    private double rayon;

    public Cercle2(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public void deplaceCentre(double dx, double dy) {
        super.deplace(dx, dy);
    }

    public void changeRayon(double rayon) {
        this.rayon = rayon;
    }

    public Point getCentre() {
        return new Point(getX(), getY());
    }

    public void affiche() {
        System.out.println("Centre du cercle: (" + getX() + ", " + getY() + ")");
        System.out.println("Rayon du cercle: " + rayon);
    }

}
