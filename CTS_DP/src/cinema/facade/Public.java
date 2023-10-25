package cinema.facade;

import java.util.ArrayList;

public class Public {
    private int nrPersoane;
    private ArrayList<Persoana> persoane;

    public Public(int _nrPersoane) {
        nrPersoane = _nrPersoane;
        persoane = new ArrayList<Persoana>();
        for(int i = 0; i < nrPersoane; i++) {
            persoane.add(new Persoana("P" + (i + 1) ) );
        }
    }

    public void publiculIntraInSala() {
        System.out.println("Publicul intra in sala");
        for(int i = 0; i < nrPersoane; i++) {
            persoane.get(i).merge();
        }
    }

    public void publiculIeseDinSala() {
        System.out.println("Publicul iese din sala");
        for(int i = 0; i < nrPersoane; i++) {
            persoane.get(i).merge();
        }
    }
}
