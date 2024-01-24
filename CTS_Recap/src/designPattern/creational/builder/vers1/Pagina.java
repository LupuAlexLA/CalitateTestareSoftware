package designPattern.creational.builder.vers1;

public class Pagina {
    private String nume;
    private int parametrii;
    private boolean areFiltru;
    private boolean areTabel;

    public Pagina() {
    }

    public Pagina(String nume, int parametrii, boolean areFiltru, boolean areTabel) {
        this.nume = nume;
        this.parametrii = parametrii;
        this.areFiltru = areFiltru;
        this.areTabel = areTabel;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getParametrii() {
        return parametrii;
    }

    public void setParametrii(int parametrii) {
        this.parametrii = parametrii;
    }

    public boolean isAreFiltru() {
        return areFiltru;
    }

    public void setAreFiltru(boolean areFiltru) {
        this.areFiltru = areFiltru;
    }

    public boolean isAreTabel() {
        return areTabel;
    }

    public void setAreTabel(boolean areTabel) {
        this.areTabel = areTabel;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "nume='" + nume + '\'' +
                ", parametrii=" + parametrii +
                ", areFiltru=" + areFiltru +
                ", areTabel=" + areTabel +
                '}';
    }
}
