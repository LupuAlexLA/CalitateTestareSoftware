import org.json.JSONArray;
import org.json.JSONTokener;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    static final String CALE_PRODUSE = "date\\produse.txt";
    static final String CALE_TRANZACTII = "date\\tranzactii.json";
    static List<Produs> produse;

    public static void main(String[] args) throws Exception {

        // afisare nr produse
        try(var fisier = new BufferedReader(new FileReader(CALE_PRODUSE))) {
            produse = fisier.lines()
                    .map(linie -> new Produs(
                            Integer.parseInt(linie.split(",")[0]),
                            linie.split(",")[1],
                            Double.parseDouble(linie.split(",")[2])
                    )).collect(Collectors.toList());
        }

//        System.out.printf("Nr produse: %d%n", produse.size());
//
//        System.out.println(produse);
//
//        for(int i = 0; i < produse.size(); i++) {
//            System.out.println(produse.get(i));
//        }

        // afisare produse sortate alfabetic
//        produse.stream()
//                .sorted((p1, p2) -> p1.getDenumire().compareTo(p2.getDenumire()))
//                .forEach(p -> System.out.println(p.getDenumire()));
//        System.out.println();

        // parcurgere json
        try(var fisier = new FileReader(CALE_TRANZACTII)) {
            var array = new JSONArray(new JSONTokener(fisier));
            for(int i = 0; i < array.length(); i++) {
                var jsonTranzactie = array.getJSONObject(i);
                var cod = jsonTranzactie.getInt("codProdus");
                var cantitate = jsonTranzactie.getInt("cantitate");
                var tip = jsonTranzactie.getString("tip");

                if(tip.equals("iesire")) {
                    cantitate = -cantitate;
                }

                produse.stream()
                        .filter(p -> p.getCod() == cod)
                        .findFirst().orElse(null)
                        .getTranzactii().add(new Tranzactie(cantitate));
            }
        }

        // scrie în fișierul text un raport de forma: Denumire Produs, Numar tranzactii
        try(var fisier = new PrintWriter(new FileWriter("date\\lista.txt"))) {
            produse.stream()
                    .sorted((p1,p2) -> Integer.compare(p2.getTranzactii().size(), p1.getTranzactii().size()))
                    .forEach(p -> fisier.printf("%s, %d%n",
                            p.getDenumire(),
                            p.getTranzactii().size()));
        }

        // se afișeaza la consolă valoarea totală a stocurilor
        double valoareTotala = 0;
        for(var produs : produse) {
            valoareTotala += produs.getValoareStoc();
        }
        System.out.printf("Valoarea totala a stocului curent este %.2f lei%n", valoareTotala);

    }
}
