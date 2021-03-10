package generice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista =  new ArrayList<>();
        String gabi = "Gabi";
        lista.add(gabi);

        GenericBox<String> cutie = new GenericBox<>();
        GenericBox<Integer> cutieInteger = new GenericBox<>();

        cutie.add("Gabi");
        cutieInteger.add(2);

        int x = cutieInteger.getData();
        String nume = cutie.getData();
    }
}
