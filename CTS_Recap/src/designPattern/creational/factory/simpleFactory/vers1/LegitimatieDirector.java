package designPattern.creational.factory.simpleFactory.vers1;

public class LegitimatieDirector implements Legitimatie{
    @Override
    public void descriere() {
        System.out.println("Legitimatie! Este Director la Firma X");
    }
}
