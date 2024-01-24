package designPattern.creational.factory.simpleFactory.vers2;

public abstract class Legitimatie {
    private String nume;
    public abstract String getTip();
    public abstract void afisare(String nume);
    public void setNume(String nume) {
        this.nume = nume;
    }
}
