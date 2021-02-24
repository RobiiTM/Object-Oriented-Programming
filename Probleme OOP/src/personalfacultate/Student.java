package personalfacultate;

public class Student extends Persoana {
    private int anCurent;

    public Student(String nume, String prenume, int varsta, int anCurent) {
        super(nume, prenume, varsta);
        System.out.println("Studentul s-a creat.");
    }

    public int getAnCurent() {
        return anCurent;
    }
    public void setAnCurent(int anCurent) {
        this.anCurent = anCurent;
    }

    public void schimbaNume(String nume) {
        super.setNume(nume);
    }
}
