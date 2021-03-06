package paint;

public class Dreptunghi extends FormaGeometrica{
    private int lungime;
    private int latime;

    public int getLungime() {
        return lungime;
    }
    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }
    public void setLatime(int latime) {
        this.latime = latime;
    }

    @Override
    public void deseneaza() {
        System.out.println("Punctul de desenare");
        System.out.println(super.getStartPointX() + " " + super.getStartPointY());
        System.out.println("Lungimea dreptunghiului este " + lungime + " si latimea este " + latime);
    }
}
