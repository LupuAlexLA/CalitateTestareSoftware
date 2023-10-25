package asigurare.composite;

import java.util.ArrayList;

public class Structura extends Nod{
    ArrayList<Nod> structura = new ArrayList<>();
    String numeStructura;

    public Structura(String numeStructura) {
        this.numeStructura = numeStructura;
    }

    @Override
    public String getInfo() {
        StringBuffer sb = new StringBuffer();
        sb.append(numeStructura);
        sb.append("\n");

        for(Nod nod : structura) {
            sb.append("\t" + nod.getInfo());
            sb.append("\n");
        }

        return sb.toString();
    }

    @Override
    public String getNume() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getPost() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void adaugaNod(Nod elemStructura) {
        structura.add(elemStructura);
    }

    @Override
    public void stergeNod(Nod elemStructura) {
        structura.remove(elemStructura);
    }

    @Override
    public Nod getNod(int i) {
        return (Nod)structura.get(i);
    }
}











