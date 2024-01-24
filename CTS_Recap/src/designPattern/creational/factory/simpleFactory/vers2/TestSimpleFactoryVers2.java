package designPattern.creational.factory.simpleFactory.vers2;

public class TestSimpleFactoryVers2 {
    public static void main(String[] args) {
        LegitimatieFactory factory = new LegitimatieFactory();

        Legitimatie legitimatie1 = factory.createInstance(TipLegitimatie.DIRECTOR, "Dom director");

        Legitimatie legitimatie2 = factory.createInstance(TipLegitimatie.ADMINISTRATOR, "Dom admin");

        Legitimatie legitimatie3 = factory.createInstance(TipLegitimatie.PROGRAMATOR, "Nea programator");

        System.out.println("Legitimatie de tip: " + legitimatie1.getTip());
        System.out.println("Legitimatie de tip: " + legitimatie2.getTip());
        System.out.println("Legitimatie de tip: " + legitimatie3.getTip());
    }
}
