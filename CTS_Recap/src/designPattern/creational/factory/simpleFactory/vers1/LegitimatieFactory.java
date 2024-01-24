package designPattern.creational.factory.simpleFactory.vers1;

public class LegitimatieFactory {
    Legitimatie createInstace(TipLegitimatie tip) {
        switch (tip) {
            case DIRECTOR: {
                return new LegitimatieDirector();
            }
            case ADMINISTRATOR: {
                return new LegitimatieAdministrator();
            }
            case PROGRAMATOR: {
                return new LegitimatieProgramator();
            }
            default: {
                return null;
            }
        }
    }
}
