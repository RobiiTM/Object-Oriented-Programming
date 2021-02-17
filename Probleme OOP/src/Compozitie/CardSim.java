package Compozitie;

public class CardSim {
    private String operator;
    private String frecventa;
    private Contact[] contacte;

    public CardSim(int frecventa, String operator) {
        this.operator = operator;
        this.frecventa = frecventa + "G";
    }

    public void setFrecventa(int frecventa) {
        this.frecventa = frecventa + "G";
    }

    public String getNumeFrecventa() {
        return this.frecventa;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public Contact[] getContacte() {
        return contacte;
    }

    public void setContacte(Contact[] contacte) {
        this.contacte = contacte;
    }
}
