package colectie;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Product mere = new Product();
        mere.setName("mere");
        list.add(mere);

        Product pere = new Product();
        pere.setName("pere");
        list.add(pere);

        Product ananas = new Product();
        ananas.setName("ananas");
        list.add(ananas);

        list.remove(pere);

        for (int i = 0; i < list.size(); i ++) {
            Product product = list.get(i);
            System.out.println(product.getName());
        }
    }
}