package contBancar;

import java.util.Scanner;

public class Cont {
    private int idCont;
    private double soldCont;
    private double anualInterestRate;
    private String dateCreate;
    Scanner scanner = new Scanner(System.in);

    private Cont() {

    }

    public Cont(int idCont, double soldCont) {
        this.idCont = idCont;
        this.soldCont = soldCont;
    }

    public int getIdCont() {
        return idCont;
    }
    public void setIdCont(int idCont) {
        this.idCont = idCont;
    }

    public double getSoldCont() {
        return soldCont;
    }
    public void setSoldCont(double soldCont) {
        this.soldCont = soldCont;
    }

    public double getAnualInterestRate() {
        return anualInterestRate;
    }
    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    public String getDateCreate() {
        return dateCreate;
    }
    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public double monthlyInterestRate(double soldCont, double anualInterestRate) {
        double taxa = soldCont - (anualInterestRate / 100 * soldCont);
        return taxa;
    }

    public double retragere(double soldCont) {
        System.out.println("Ce suma doresti sa retragi?");
        double sumaRetrasa = scanner.nextDouble();
        scanner.nextLine();
        if (sumaRetrasa > soldCont) {
            System.out.println("Nu aveti soldul disponibil.");
        } else {
            System.out.println("Ati retras " + sumaRetrasa + " de lei cu succes.");
        }
        return sumaRetrasa;
    }

    public double depunere () {
        System.out.println("Introduceti suma pe care doriti s-o depuneti.");
        double sumaDepusa = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ati depus " + sumaDepusa + " de lei cu succes.");
        System.out.println("Aveti " + (sumaDepusa + soldCont) + " de lei in cont.");
        return sumaDepusa;
    }
}