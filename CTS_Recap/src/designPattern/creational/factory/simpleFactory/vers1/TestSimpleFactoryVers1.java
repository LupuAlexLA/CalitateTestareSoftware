package designPattern.creational.factory.simpleFactory.vers1;

public class TestSimpleFactoryVers1 {
    public static void main(String[] args) {
        LegitimatieFactory factory = new LegitimatieFactory();
        Legitimatie legitimatie;

        legitimatie = factory.createInstace(TipLegitimatie.DIRECTOR);
        legitimatie.descriere();

        legitimatie = factory.createInstace(TipLegitimatie.ADMINISTRATOR);
        legitimatie.descriere();

        legitimatie = factory.createInstace(TipLegitimatie.PROGRAMATOR);
        legitimatie.descriere();
    }
}
