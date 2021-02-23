package cerc;

public class Cerc {
    private double raza;

    public double getRaza() {
        return raza;
    }
    public void setRaza(double raza) {
        this.raza = raza;
    }

    public double formulaRaza(int raza, double arie) {
        arie = Math.PI * (this.raza * 2);
        return arie;
    }
}
