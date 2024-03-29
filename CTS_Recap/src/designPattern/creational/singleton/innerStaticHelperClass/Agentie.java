package designPattern.creational.singleton.innerStaticHelperClass;

public class Agentie {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static class AgentieHelper{
        private static final Agentie instanta = new Agentie();
    }

    public static Agentie getInstanta(String nume, float capital, int numarAngajati) {
        return AgentieHelper.instanta;
    }

    private Agentie() {
        this.numeAgentie = "AgeTur";
        this.capital = 1000;
        this.numarAngajati = 5;
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
