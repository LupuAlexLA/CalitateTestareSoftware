package cinema.builder;

public class Sala {
    private int numarSala;
    private boolean luminaAprinsa;
    private boolean usaDeschisa;
    private String filmDifuzat;

    public Sala() {
    }

    public Sala(int numarSala, boolean luminaAprinsa, boolean usaDeschisa, String filmDifuzat) {
        this.numarSala = numarSala;
        this.luminaAprinsa = luminaAprinsa;
        this.usaDeschisa = usaDeschisa;
        this.filmDifuzat = filmDifuzat;
    }

    public int getNumarSala() {
        return numarSala;
    }

    public void setNumarSala(int numarSala) {
        this.numarSala = numarSala;
    }

    public boolean isLuminaAprinsa() {
        return luminaAprinsa;
    }

    public void setLuminaAprinsa(boolean luminaAprinsa) {
        this.luminaAprinsa = luminaAprinsa;
    }

    public boolean isUsaDeschisa() {
        return usaDeschisa;
    }

    public void setUsaDeschisa(boolean usaDeschisa) {
        this.usaDeschisa = usaDeschisa;
    }

    public String getFilmDifuzat() {
        return filmDifuzat;
    }

    public void setFilmDifuzat(String filmDifuzat) {
        this.filmDifuzat = filmDifuzat;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numarSala=" + numarSala +
                ", luminaAprinsa=" + luminaAprinsa +
                ", usaDeschisa=" + usaDeschisa +
                ", filmDifuzat='" + filmDifuzat + '\'' +
                '}';
    }
}
