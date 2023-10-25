package asigurare.command;

public class TestCommand {
    public static void main(String[] args) {
        Manager manager = new Manager("Costache Ion");
        Secretara secretara = new Secretara();

        secretara.preiaMesaj(new MesajInfo(manager, "Contractul x a fost incheiat."));
        secretara.preiaMesaj(new MesajModificare(manager,
                "Limita maxima RCA oferita de Omniasig a fost modificata la 100.000 euro."));
        secretara.preiaMesaj(new MesajContact(manager,
                "Agent vanzari Popescu Marcel pentru a discuta despre contractul in curs."));

        System.out.println("Data 13.12.2020");
        secretara.transmiteMesaje();

        secretara.preiaMesaj(new MesajInfo(manager, "Contractul Y a fost incheiat."));

        System.out.println("\nData 13.01.2021: Flux de mesaje transmis de secretara");
        secretara.transmiteMesaje();
    }
}
