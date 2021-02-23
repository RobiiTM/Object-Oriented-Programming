package dreptunghi;

public class Dreptunghi {
    private double latime = 1;
    private double lungime = 1;

    public double getLatime() {
        return latime;
    }
    public void setLatime(double latime) {
        this.latime = latime;
    }

    public double getLungime() {
        return lungime;
    }
    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public Dreptunghi(double latime, double lungime) {
        this.latime = latime;
        this.lungime = lungime;
    }

    public Dreptunghi() {

    }

    public double formulaArie(int lungime, int latime) {
        int aria = lungime * latime;
        return aria;
    }

    public double formulaPerimetru(int lungime, int latime) {
        int perimetru = 2 * (lungime * latime);
        return perimetru;
    }
}