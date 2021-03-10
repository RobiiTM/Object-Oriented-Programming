package blocul;

import java.util.ArrayList;

public class Apartament {
    private int numarApartament;
    private String numeFamilie;

    public int getNumarApartament() {
        return numarApartament;
    }
    public void setNumarApartament(int numarApartament) {
        this.numarApartament = numarApartament;
    }

    public String getNumeFamilie() {
        return numeFamilie;
    }
    public void setNumeFamilie(String numeFamilie) {
        this.numeFamilie = numeFamilie;
    }

    public void display() {
        System.out.println("ap. " + numarApartament + " - fam. " + numeFamilie);
    }
}