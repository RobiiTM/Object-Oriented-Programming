package bursa;

public class Stock {
    private String simbol;
    private String numeStock;
    private double closingPrice;
    private double currentPrice;

    public Stock(String simbol, String numeStock) {
        this.simbol = simbol;
        this.numeStock = numeStock;
    }

    public String getSimbol() {
        return simbol;
    }
    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public String getNumeStock() {
        return numeStock;
    }
    public void setNumeStock(String numeStock) {
        this.numeStock = numeStock;
    }

    public double getClosingPrice() {
        return closingPrice;
    }
    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double changedPercent(double closingPrice, double currentPrice) {
        double procentaj = 100 * (currentPrice - closingPrice) / closingPrice;
        return procentaj;
    }
}