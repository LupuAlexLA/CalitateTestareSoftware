package designPattern.creational.factory.simpleFactory.vers2;

public class Director extends Legitimatie{
    @Override
    public String getTip() {
        return "Director";
    }

    @Override
    public void afisare(String nume) {
        System.out.println("Director: " + nume);
    }
}
