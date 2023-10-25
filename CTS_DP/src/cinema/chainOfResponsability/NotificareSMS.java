package cinema.chainOfResponsability;

public class NotificareSMS extends ANotificare{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNr_telefon() != null) {
            System.out.println(client.getNume() + " ai un SMS cu mesajul " + mesaj);
        } else {
            super.operatiaUrmatoare.notifica(client, mesaj);
        }
    }
}
