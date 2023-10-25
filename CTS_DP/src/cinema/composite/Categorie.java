package cinema.composite;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements INod{
    List<INod> subnoduri = new ArrayList<>();
    private String numeCategorie;

    public Categorie(String numeCategorie) {
        super();
        this.numeCategorie = numeCategorie;
    }

    @Override
    public void printeazaDescriere(String spatii) {
        System.out.println(spatii + "Categorie: " + numeCategorie + " contine: ");
        for(INod nod: subnoduri) {
            nod.printeazaDescriere(spatii + "   ");
        }
    }

    @Override
    public void adaugaNod(INod nod) {
        subnoduri.add(nod);
    }

    @Override
    public void stergeNod(INod nod) {
        subnoduri.remove(nod);
    }

    @Override
    public INod getNod(int i) {
        return subnoduri.get(i);
    }
}

