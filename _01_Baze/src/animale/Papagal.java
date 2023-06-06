package animale;

public class Papagal extends Animal{
    private String culoare;

    public Papagal(String specie, int durataViata, String culoare) {
        super(specie, durataViata);
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void mananca() {
        super.mananca();
    }

    @Override
    public void procreeaza() {
        super.procreeaza();
    }

    public void vorbeste() {
        System.out.println("Papagalul " + culoare + " vorbeste!");
    }

    @Override
    public String toString() {
        return "Papagal{" +
                "culoare='" + culoare + '\'' +
                '}';
    }
}
