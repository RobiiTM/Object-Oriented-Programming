package personalfacultate;

public class Main {
    public static void main(String[] args) {
       Student student = new Student("Ionescu", "Gabriel", 27, 1);
       Profesor profesor = new Profesor("Popescu", "Ion", 30,"Engleza");
       Persoana persoana = new Persoana("Alex", "Vladut", 23);

       Persoana[] grupDePersoane = new Persoana[5];
       grupDePersoane[0] = persoana;
       grupDePersoane[1] = profesor;
       grupDePersoane[2] = student;

       for(int i = 0; i < grupDePersoane.length; i++) {
           Persoana per = grupDePersoane[i];
           if (per != null) {
               afisarePersoana(per);
           }
       }
    }
        //POLIMORFISM
    public static void afisarePersoana (Persoana persoana) {
        String nume = persoana.getNume();
        String prenume = persoana.getPrenume();
        System.out.println(nume + " " + prenume);
    }
}
