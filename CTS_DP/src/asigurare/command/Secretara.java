package asigurare.command;

import java.util.ArrayList;

public class Secretara {
    public ArrayList<Mesaj> listaMesaje;

    public Secretara() {
        listaMesaje = new ArrayList<>();
    }

    public void preiaMesaj(Mesaj mesaj) {
        this.listaMesaje.add(mesaj);
    }

    public void transmiteMesaje() {
        for(Mesaj m : listaMesaje) {
            m.proceseaza();
        }
        listaMesaje.clear();
    }
}
