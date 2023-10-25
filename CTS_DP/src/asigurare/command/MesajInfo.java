package asigurare.command;

public class MesajInfo implements Mesaj{
    private Manager manager;
    private String text;

    public MesajInfo(Manager manager, String text) {
        this.manager = manager;
        this.text = text;
    }

    @Override
    public void proceseaza() {
        manager.proceseazaMesajInfo(this.text);
    }
}
