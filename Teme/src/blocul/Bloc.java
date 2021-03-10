package blocul;

import java.util.ArrayList;

public class Bloc {
    private String numeBloc;
    private ArrayList<Etaj> etajeDinBloc = new ArrayList<>();

    public String getNumeBloc() {
        return numeBloc;
    }
    public void setNumeBloc(String numeBloc) {
        this.numeBloc = numeBloc;
    }

    public ArrayList<Etaj> getEtajeDinBloc() {
        return etajeDinBloc;
    }
    public void setEtajeDinBloc(ArrayList<Etaj> etajeDinBloc) {
        this.etajeDinBloc = etajeDinBloc;
    }

    public void display(){
        System.out.println("Bloc: " + numeBloc);
        for (int i = 0; i < etajeDinBloc.size(); i++) {
            Etaj etaj = etajeDinBloc.get(i);
            etaj.display();
        }
    }
}