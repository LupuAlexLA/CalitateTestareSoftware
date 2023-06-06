package animale;

public class Animal {
    private String specie;
    private int durataViata;

    public Animal(String specie, int durataViata) {
        this.specie = specie;
        this.durataViata = durataViata;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getDurataViata() {
        return durataViata;
    }

    public void setDurataViata(int durataViata) {
        this.durataViata = durataViata;
    }

    public void mananca() {
        System.out.println("Animalul " + specie + " mananca!");
    }

    public void procreeaza() {
        System.out.println("Animalul " + specie + " se procreeaza!");
    }
}
