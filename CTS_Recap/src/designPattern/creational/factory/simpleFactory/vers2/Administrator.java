package designPattern.creational.factory.simpleFactory.vers2;

public class Administrator extends Legitimatie{
    @Override
    public String getTip() {
        return "Administrator";
    }

    @Override
    public void afisare(String nume) {
        System.out.println("Administrator: " + nume);
    }
}
