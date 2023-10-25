package cinema.memento;

public class TestMemento {
    public static void main(String[] args) {
        Rezervare r = new Rezervare();
        ManagerRezervari mr = new ManagerRezervari();

        r.setNr_locuri(4);
        mr.add(r.saveStateToMemento());

        r.setNr_locuri(6);
        mr.add(r.saveStateToMemento());

        r.setNr_locuri(2);
        mr.add(r.saveStateToMemento());

        String mesaj = "Numar locuri rezervate: ";
        System.out.println(mesaj + r.getNr_locuri());
        System.out.println(mesaj + mr.get(0).getNr_locuri());
        System.out.println(mesaj + mr.lastMemento().getNr_locuri());
        System.out.println(mesaj + mr.lastMemento().getNr_locuri());
        System.out.println(mesaj + mr.lastMemento().getNr_locuri());
        System.out.println(mesaj + mr.lastMemento().getNr_locuri());
    }
}
