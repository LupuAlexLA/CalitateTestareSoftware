package corporatie;

import java.util.*;

public class ProgramJCF {
    public static void main(String[] args) {
        // Set
        Set<String> animale = new HashSet<>(); // elem unice, fara ordine
        animale.add("caine");
        animale.add("pisica");
        System.out.println(animale);
        System.out.println(animale.size());
        for (String i : animale) {
            System.out.println(i);
        }
        if (animale.contains("pisica")) {
            System.out.println(true);
            ;
        } else {
            System.out.println(false);
        }
        animale.remove("pisica");
        System.out.println(animale);
        if (animale.contains("pisica")) {
            System.out.println(true);
            ;
        } else {
            System.out.println(false);
        }

    }
}
