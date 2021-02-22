package compozitie;

public class Telefon {
    private String model;
    private int memorie;
    private int diagonala;
    private CardSim sim;

    public Telefon(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemorie() {
        return this.memorie;
    }

    public void setMemorie(int memorie) {
        this.memorie = memorie;
    }

    public int getDiagonala() {
        return this.diagonala;
    }

    public void setDiagonala(int diagonala) {
        this.diagonala = diagonala;
    }

    public CardSim getSim() {
        return this.sim;
    }

    public void setSim(CardSim sim) {
        this.sim = sim;
    }
}
