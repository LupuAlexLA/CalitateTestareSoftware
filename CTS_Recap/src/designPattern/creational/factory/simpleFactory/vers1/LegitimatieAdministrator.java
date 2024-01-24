package designPattern.creational.factory.simpleFactory.vers1;

public class LegitimatieAdministrator implements Legitimatie{
    @Override
    public void descriere() {
        System.out.println("Legitimatie! Este Administrator la Firma X");
    }
}
