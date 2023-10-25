package asigurare.composite;

public abstract class Nod {
    public abstract String getNume();
    public abstract String getPost();

    public String getInfo() {
        return this.getNume() + ": " + this.getPost();
    }

    public void adaugaNod(Nod elemStructura) {
        throw new UnsupportedOperationException();
    }

    public void stergeNod(Nod elemStructura) {
        throw new UnsupportedOperationException();
    }

    public Nod getNod(int i) {
        throw new UnsupportedOperationException();
    }
}
