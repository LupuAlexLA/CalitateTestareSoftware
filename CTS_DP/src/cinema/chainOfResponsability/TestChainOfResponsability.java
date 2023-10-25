package cinema.chainOfResponsability;

public class TestChainOfResponsability {
    public static void main(String[] args) {
        ANotificare SMS = new NotificareSMS();
        ANotificare mail = new NotificareEmail();
        ANotificare manager = new NotificareManager();

        SMS.setOperatiaUrmatoare(mail);
        mail.setOperatiaUrmatoare(manager);

        Client c1 = new Client("Popescu", "0744293244", "popescu@mail.ro");
        Client c2 = new Client("Ionescu");
        c2.setAdresa_mail("ionescu@mail.ro");
        Client c3 = new Client("Vasilescu");
        String mesaj = "Incepand de astazi cinematograful nostru prezinta filme 3D";

        SMS.notifica(c1, mesaj);
        SMS.notifica(c2, mesaj);
        SMS.notifica(c3, mesaj);
    }
}
