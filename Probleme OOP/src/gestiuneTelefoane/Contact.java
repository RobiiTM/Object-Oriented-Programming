package gestiuneTelefoane;

public class Contact {
    private String nume;
    private String prenume;
    private String nrDeTelefon;

    public Contact(String nume, String prenume, String nrDeTelefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.nrDeTelefon = nrDeTelefon;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNrDeTelefon() {
        return nrDeTelefon;
    }

    public void setNrDeTelefon(String nrDeTelefon) {
        this.nrDeTelefon = nrDeTelefon;
    }
}