package designPattern.creational.factory.simpleFactory.vers2;

public class Programator extends Legitimatie{
    @Override
    public String getTip() {
        return "Programator";
    }

    @Override
    public void afisare(String nume) {
        System.out.println("Programator: " + nume);
    }
}
