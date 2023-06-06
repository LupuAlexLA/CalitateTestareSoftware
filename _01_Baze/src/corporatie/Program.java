package corporatie;

public class Program {
    public static void main(String[] args) {

        Patron p1 = new Patron("Niva", "Mihai", 200000);
        System.out.println(p1);

        try {
            Patron p2 = (Patron) p1.clone();
            p2.setNumePatron("Vladimir");
            p2.setProfitDorit(150000);
            System.out.println(p2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        p1.lucreaza();

        ITist i1 = new ITist("Niva", "Bogdan", 1);
        System.out.println(i1);
        ITist i2 = new ITist("Niva", "Teo", 3);
        System.out.println(i2);

        IRemunerabil r = i1;
        int salariu = r.primesteSalariu();
        System.out.println("Bogdan primeste " + salariu);

        System.out.println("Teo primeste " + i2.primesteSalariu());

        i1.lucreaza();

        int[] vector = new int[] {100, 50, 75};

        MKer m1 = new MKer("Niva", "Alex", vector, 10);
        System.out.println("Alex primeste " + m1.primesteSalariu());
        m1.setCampanii(vector);
        System.out.println(m1);
        m1.lucreaza();


    }
}
