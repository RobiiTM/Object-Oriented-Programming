package gestiuneTelefoane;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int optiune = -1;
        Telefon[] telefoaneInregistrate = new Telefon[10];
        int index = 0;
        while (optiune != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Afiseaza telefoane inregistrate");
            System.out.println("2. Inregistreaza un nou telefon");
            System.out.println("3. Afiseaza contacte dintr-un anumit telefon");
            System.out.println("4. Adauga un contact intr-un anumit telefon");
            System.out.println("0. Iesire");
            System.out.println("Alegeti o optiune dintre cele disponibile");
            optiune = scanner.nextInt();
            scanner.nextLine();

            if (optiune == 2) {
                System.out.println("Introduceti numele telefonului: ");
                String nume = scanner.nextLine();
                Telefon telefon = new Telefon(nume);
                telefoaneInregistrate[index] = telefon;
                index++;
            }

            if (optiune == 1) {
                System.out.println("----TELEFOANE EXISTENTE----");
                afisareTelefoane(telefoaneInregistrate);
                System.out.println("---------------------------");
            }

            if (optiune == 4) {
                System.out.println("----TELEFOANE EXISTENTE----");
                afisareTelefoane(telefoaneInregistrate);
                System.out.println("---------------------------");
                System.out.println("Alegeti telefonul in care doriti sa adaugati un contact nou");
                int indexulTelefonuluiAles = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti numele noului contact");
                String nume = scanner.nextLine();
                System.out.println("Introduceti prenumele noului contact");
                String prenume = scanner.nextLine();
                System.out.println("Introduceti numarul de telefon al noului contact");
                String nrTelefon = scanner.nextLine();

                Contact contact = new Contact(nume, prenume, nrTelefon);
                Telefon telefonAles = telefoaneInregistrate[indexulTelefonuluiAles - 1];
                telefonAles.addContact(contact);
            }

            if (optiune == 3) {
                System.out.println("----TELEFOANE EXISTENTE----");
                afisareTelefoane(telefoaneInregistrate);
                System.out.println("---------------------------");
                System.out.println("Alegeti telefonul din care doriti sa afisati contactele");
                int indexulTelefonuluiAles = scanner.nextInt();
                scanner.nextLine();
                Telefon telefonAles = telefoaneInregistrate[indexulTelefonuluiAles - 1];
                Contact[] contacts = telefonAles.getContacte();
                afisareContacte(contacts);
            }
        }
    }
    public static void afisareContacte (Contact[] contacts) {
        for (int i = 0; i < contacts.length; i++) {
            Contact contact = contacts[i];
            if (contact != null) {
                String nume = contact.getNume();
                String prenume = contact.getPrenume();
                String telefon = contact.getNrDeTelefon();
                System.out.println("----CONTACTE EXISTENTE----");
                System.out.println(nume + " " + prenume + " | " + telefon);
                System.out.println("--------------------------");
            }
        }
    }
    public static void afisareTelefoane(Telefon[] telefoaneInregistrate) {
        for (int i = 0; i < telefoaneInregistrate.length; i++) {
            Telefon telefon = telefoaneInregistrate[i];
            if (telefon != null) {
                String nume = telefon.getNume();
                System.out.println(i + 1 + ". " + nume);
            }
        }
    }
}