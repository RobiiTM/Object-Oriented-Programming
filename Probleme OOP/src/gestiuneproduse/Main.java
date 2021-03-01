package gestiuneproduse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opriune = -1;
        Produs[] produse = new Produs[100];
        int index = 0;
        while (opriune != 0) {
            System.out.println("1. Adauga fructe");
            System.out.println("2. Adauga dulciuri");
            System.out.println("3. Adauga haine");
            System.out.println("4. Afiseaza produsele");
            System.out.println("0. Exit");
            System.out.println("Introduceti o optiune");
            opriune = scanner.nextInt();
            scanner.nextLine();
            if (opriune == 1 || opriune == 2 || opriune == 3) {
                System.out.println("Ce produs doriti sa introduceti?: ");
                String nume = scanner.nextLine();
                System.out.println("Introduceti pretul: ");
                double pret = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introduceti producatorul: ");
                String producator = scanner.nextLine();
                if (opriune == 1) {
                    System.out.println("Este bio? (Da/Nu)");
                    String esteBio = scanner.nextLine();
                    boolean isBio = false;
                    if (esteBio.equals("Da")) {
                        isBio = true;
                    }
                    Fruct fruct = new Fruct(nume, pret, producator);
                    fruct.setBio(isBio);
                    produse[index] = fruct;
                    index++;
                }
                if (opriune == 2) {
                    System.out.println("Inroduceti gramajul: ");
                    int gramaj = scanner.nextInt();
                    scanner.nextLine();
                    Dulciuri dulciuri = new Dulciuri(nume, pret, producator);
                    produse[index] = dulciuri;
                    index++;
                }
                if (opriune == 3) {
                    System.out.println("Introduceti marimea: ");
                    String marime = scanner.nextLine();
                    Haine haine = new Haine(nume, pret, producator);
                    haine.setMarime(marime);
                    produse[index] = haine;
                    index++;
                }
            }
            if (opriune == 4) {
                afisareProduse(produse);
            }
            if (opriune == 0) {
                return;
            }
        }
    }
    private static void afisareProduse(Produs[] produse) {
        for (int i = 0; i < produse.length; i++) {
            Produs produs = produse[i];
            if (produs != null) {
                String nume = produs.getNume();
                double pret = produs.getPret();
                String producator = produs.getProducator();
                System.out.println("Nume produs: " + nume + " | " + "Pret: " + pret + " lei" + " | " + "Producator: " + producator);
                System.out.println("");
            }
        }
    }
}