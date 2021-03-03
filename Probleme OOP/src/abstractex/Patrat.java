package abstractex;

public class Patrat extends FormaGeometrica {
    private double lun;

    public double getLun() {
        return lun;
    }
    public void setLun(double lun) {
        this.lun = lun;
    }

    @Override
    public double calculateArea() {
        return lun * lun;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * lun;
    }
}
