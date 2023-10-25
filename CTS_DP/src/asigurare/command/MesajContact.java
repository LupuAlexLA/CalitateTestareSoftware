package asigurare.command;

public class MesajContact implements Mesaj{
    private Manager manager;
    private String text;

    public MesajContact(Manager manager, String text) {
        this.manager = manager;
        this.text = text;
    }

    @Override
    public void proceseaza() {
        manager.proceseazaMesajContact(this.text);
    }
}
