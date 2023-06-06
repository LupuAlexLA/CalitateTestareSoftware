package corporatie;

import java.util.ArrayList;
import java.util.List;

public class ProgramGeneric {
    public static void main(String[] args) {

        // ex 1 - lista cu intregi
        List<Integer> listInt = new ArrayList<>();
        listInt.add(3);
        listInt.add(13);
        listInt.add(23);
        for(Integer x : listInt) {
            System.out.println(x);
        }

        // ex 2 - lista cu obiecte
        List<ITist> listIts = new ArrayList<>();
        listIts.add(new ITist("Niva", "Florin", 1));
        listIts.add(new ITist("Niva", "Marian", 2));
        for(ITist y : listIts) {
            System.out.println(y);
        }

        // ex 3 - lista de orice // ca sa mearga tre sa scot extends din <> in corporatie.Muncitor
//        corporatie.Muncitor<String> muncitor1 = new corporatie.Muncitor<>("Florin s-a legitimat");
//        muncitor1.legitimeazaMuncitor();
//        corporatie.Muncitor<Integer> muncitor2 = new corporatie.Muncitor<>(23);
//        muncitor2.legitimeazaMuncitor();

        // ex 4 - oblig sa fie o lista de ob ce deriveaza ceva anume
        Muncitor<Actionar> actionarMuncitor = new Muncitor<>(new Actionar("Gigel", 10));
        Muncitor<Patron> patronMuncitor = new Muncitor<>(new Patron("Dorel", 400000));
        actionarMuncitor.legitimeazaMuncitor();
        patronMuncitor.legitimeazaMuncitor();

        // ex 5 - generic methods
        ceva("lucratorul lucreaza");
        ceva(4);
        altceva("Cati ani ai ", 5);

    }

    private static <T> void ceva(T faCeva) {
        System.out.println(faCeva + "!!!");
    }

    private static <T, V> void altceva(T faCeva, V faAltceva) {
        System.out.println(faCeva + "???");
        System.out.println(faAltceva + "!!!");
    }
}
