package designPattern.creational.singleton.regisrtyOfSingleton;

public class TestRegisrty {
    public static void main(String[] args) {
        PachetCazare cazare=new PachetCazare();
        PachetCazare cazare2=new PachetCazare();
        PachetTransport transport=new PachetTransport();

        try {
            RegisrtyPachete.register("Cazare", cazare);
            RegisrtyPachete.register("Transport", transport);

            //RegistryPachete.register("Cazare", cazare2);

            RegisrtyPachete.getPachet("Cazare").descriere();
            RegisrtyPachete.getPachet("Transport").descriere();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
