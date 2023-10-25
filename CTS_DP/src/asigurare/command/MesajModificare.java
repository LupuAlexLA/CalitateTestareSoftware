package asigurare.command;

public class MesajModificare implements Mesaj{
    private Manager manager;
    private String text;

    public MesajModificare(Manager manager, String text) {
        this.manager = manager;
        this.text = text;
    }
    @Override
    public void proceseaza() {
        manager.proceseazaMesajModificare(this.text);
    }
}
