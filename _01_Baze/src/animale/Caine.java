package animale;

public class Caine extends Animal implements Comparable<Caine>{
    private String rasa;

    public Caine(String specie, int durataViata, String rasa) {
        super(specie, durataViata);
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    public void mananca() {
        super.mananca();
    }

    @Override
    public void procreeaza() {
        super.procreeaza();
    }

    public void latra() {
        System.out.println(rasa + " latra!");
    }

    @Override
    public int compareTo(Caine o) {
        if(getDurataViata() < o.getDurataViata()) {
            return -1;
        } else if (this.getDurataViata() == o.getDurataViata()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Caine{" +
                "rasa='" + rasa + '\'' +
                '}';
    }
}
