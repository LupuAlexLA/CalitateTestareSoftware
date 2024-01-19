package designPattern.creational.singleton.eagerInitialization;

public class Agentie {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;
    private static Agentie instanta = new Agentie(); // presupune initializarea instantei chair daca nu e folosita
    // daca singleton nu e folosit, instanta tot este creata, de aceea EagerInitialization nu e eficienta
    private Agentie() {
        this.numeAgentie = "Niva";
        this.capital = 1000;
        this.numarAngajati = 3;
    }

    public static Agentie getInstance(String nume, float capital, int numarAngajati) {
        // fara creare
        return instanta;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }
}
