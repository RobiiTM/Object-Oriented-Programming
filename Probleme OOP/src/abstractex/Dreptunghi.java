package abstractex;

public class Dreptunghi extends FormaGeometrica {
    private double lat;
    private double lun;

    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLun() {
        return lun;
    }
    public void setLun(double lun) {
        this.lun = lun;
    }

    @Override
    public double calculatePerimeter() {
        return lat * lun;
    }
    @Override
    public double calculateArea() {
        return 2 * lun + 2 * lat;
    }
}
