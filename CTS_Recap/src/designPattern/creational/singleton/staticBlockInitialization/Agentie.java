package designPattern.creational.singleton.staticBlockInitialization;

public class Agentie {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static Agentie instanta;
    // asemănătoare cu eager initialization doar că această variantă furnizează posibilitatea de captare a posibilelor
    // excepții generate de inițializarea instanței statice.
    static {
        try {
            instanta = new Agentie();
        } catch (Exception exception) {
            System.out.println("Agentia nu poate fi creata");
        }
    }

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
