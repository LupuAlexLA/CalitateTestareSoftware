package cinema.flyweight;

public class Sala {
    private int numarSala;

    public Sala(int numarSala) {
        this.numarSala = numarSala;
    }

    public Sala() {
        this.numarSala = 8;
    }

    public int getNumarSala() {
        return numarSala;
    }

    public void setNumarSala(int numarSala) {
        this.numarSala = numarSala;
    }

    @Override
    public String toString() {
        return "Sala{" + "numarSala=" + numarSala + '}';
    }
}
