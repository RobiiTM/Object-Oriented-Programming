package colectie;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Product mere = new Product();
        Product pere = new Product();
        Product ananas = new Product();
        mere.setName("mere");
        lista.addProduct(mere);
        pere.setName("pere");
        lista.addProduct(pere);
        ananas.setName("ananas");
        lista.addProduct(ananas);
        lista.removeProduct(pere);
        Product[] produseDinLista = lista.getProduse();
        for (int i = 0; i < produseDinLista.length; i++) {
            Product produs = produseDinLista[i];
            if (produs != null) {
                System.out.println(produs.getName());
            }
        }
    }
}
