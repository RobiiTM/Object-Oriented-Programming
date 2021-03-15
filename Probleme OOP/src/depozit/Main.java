package depozit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Colet colet1 = new Colet("Strada Parcului");
        Colet colet2 = new Colet("Strada Anghelescu");
        Colet colet3 = new Colet("Strada Iordanescu");
        Colet colet4 = new Colet("Strada Vladimirescu");

        Map<String, ArrayList<Colet>> depozitul = new HashMap<>();
        ArrayList<Colet> coleteDin1A = new ArrayList<>();
        coleteDin1A.add(colet1);
        coleteDin1A.add(colet2);
        depozitul.put("1A", coleteDin1A);

        ArrayList<Colet> coleteDin1B = new ArrayList<>();
        coleteDin1B.add(colet3);
        coleteDin1B.add(colet4);
        depozitul.put("1B", coleteDin1B);

        ArrayList<Colet> coleteDeLa1B = depozitul.get("1B");
        for (Colet colet : coleteDeLa1B) {
            System.out.println(colet.getAdresa());
        }
    }
}
