package gestiuneproduse;

public class Dulciuri extends Produs{
    private int gramaj;

    public Dulciuri(String nume, double pret, String producator) {
        super(nume, pret, producator);
    }

    @Override
    public String getCategory() {
        return null;
    }

    public int getGramaj() {
        return gramaj;
    }
    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }
}