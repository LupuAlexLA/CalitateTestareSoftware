package designPattern.creational.factory.simpleFactory.vers2;

public class LegitimatieFactory {
    public Legitimatie createInstance(TipLegitimatie tip, String nume) {
        Legitimatie legitimatie = null;

        switch (tip) {
            case PROGRAMATOR: {
                legitimatie = new Programator();
                legitimatie.setNume("Ionel");
                break;
            }
            case ADMINISTRATOR: {
                legitimatie = new Administrator();
                legitimatie.setNume("Gigel");
                break;
            }
            case DIRECTOR: {
                legitimatie = new Director();
                legitimatie.setNume("Dorel");
                break;
            }
        }

        return legitimatie;
    }
}
