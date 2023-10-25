package asigurare.command;

public class Manager {
    private String nume;

    public Manager(String nume) {
        this.nume = nume;
    }

    public void proceseazaMesajInfo(String text) {
        System.out.println("Managerul a citit mesajul de informare: " + text);
    }

    public void proceseazaMesajModificare(String text) {
        System.out.println("Managerul a facut modificarile: " + text);
    }

    public void proceseazaMesajContact(String text) {
        System.out.println("Managerul a contactat persoana: " + text);
    }
}
