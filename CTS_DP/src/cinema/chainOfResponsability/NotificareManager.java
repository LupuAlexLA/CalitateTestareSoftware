package cinema.chainOfResponsability;

public class NotificareManager extends ANotificare{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Cinematograful nu detine date de contact pentru clientul: " +
                client.getNume());
    }
}
