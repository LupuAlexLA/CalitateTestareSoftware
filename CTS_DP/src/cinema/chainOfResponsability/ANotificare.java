package cinema.chainOfResponsability;

public abstract class ANotificare {
    protected ANotificare operatiaUrmatoare;

    public void setOperatiaUrmatoare(ANotificare operatie) {
        operatiaUrmatoare = operatie;
    }

    public abstract void notifica(Client client, String mesaj);
}
