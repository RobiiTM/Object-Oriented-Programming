package blocul;

import java.util.ArrayList;

public class Etaj {
    private int etaj;
    private ArrayList<Apartament> apartamenteDePeEtaj = new ArrayList<>();

    public int getEtaj() {
        return etaj;
    }
    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public ArrayList<Apartament> getApartamenteDePeEtaj() {
        return apartamenteDePeEtaj;
    }
    public void setApartamenteDePeEtaj(ArrayList<Apartament> apartamenteDePeEtaj) {
        this.apartamenteDePeEtaj = apartamenteDePeEtaj;
    }

    public void display(){
        System.out.println("et. " + etaj);
        for (int i = 0; i < apartamenteDePeEtaj.size(); i++) {
            Apartament apartament = apartamenteDePeEtaj.get(i);
            apartament.display();
        }
    }
}