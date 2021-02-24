package gestiuneproduse;

public class Fruct extends Produs {
    private boolean bio;

    public Fruct(String nume, double pret, String producator) {
        super(nume, pret, producator);
    }

    public boolean isBio() {
        return bio;
    }
    public void setBio(boolean bio) {
        this.bio = bio;
    }
}