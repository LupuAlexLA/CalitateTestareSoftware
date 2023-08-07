package cinema.simpleFactory;

public class BiletFactory {
    Bilet createInstance(TipBilet tip) {
        switch (tip) {
            case Adult: {
                return new BiletAdult();
            }
            case Student: {
                return new BiletStudent();
            }
            case VIP: {
                return new BiletVIP();
            }
            default: {
                return null;
            }
        }
    }
}
