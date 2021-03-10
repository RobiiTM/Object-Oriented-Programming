package blocul;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bloc bloc = new Bloc();
        bloc.setNumeBloc("E2");
        Etaj etajParter = new Etaj();
        etajParter.setEtaj(0);
        Etaj etaj1 = new Etaj();
        etaj1.setEtaj(1);
        Apartament apartament1 = new Apartament();
        apartament1.setNumarApartament(1);
        apartament1.setNumeFamilie("Ionescu");
        Apartament apartament2 = new Apartament();
        apartament2.setNumeFamilie("Popescu");
        apartament2.setNumarApartament(2);
        Apartament apartament3 = new Apartament();
        apartament3.setNumeFamilie("Scarlatescu");
        apartament3.setNumarApartament(3);
        Apartament apartament4 = new Apartament();
        apartament4.setNumarApartament(4);
        apartament4.setNumeFamilie("Gheorghe");
        Apartament apartament5 = new Apartament();
        apartament5.setNumeFamilie("Pop");
        apartament5.setNumarApartament(5);
        Apartament apartament6 = new Apartament();
        apartament6.setNumeFamilie("Mihailescu");
        apartament6.setNumarApartament(6);

        ArrayList<Etaj> etajeDinBloc = new ArrayList<>();
        etajeDinBloc.add(etajParter);
        etajeDinBloc.add(etaj1);
        bloc.setEtajeDinBloc(etajeDinBloc);

        ArrayList<Apartament> apartamenteDePeEtajParter = new ArrayList<>();
        apartamenteDePeEtajParter.add(apartament1);
        apartamenteDePeEtajParter.add(apartament2);
        apartamenteDePeEtajParter.add(apartament3);
        etajParter.setApartamenteDePeEtaj(apartamenteDePeEtajParter);

        ArrayList<Apartament> apartamenteDePeEtaj1 = new ArrayList<>();
        apartamenteDePeEtaj1.add(apartament4);
        apartamenteDePeEtaj1.add(apartament5);
        apartamenteDePeEtaj1.add(apartament6);
        etaj1.setApartamenteDePeEtaj(apartamenteDePeEtaj1);

        bloc.display();
    }
}
