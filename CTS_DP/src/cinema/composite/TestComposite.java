package cinema.composite;

public class TestComposite {
    public static void main(String[] args) {
        Film f1 = new Film("Film de actiune");
        Film f2 = new Film("Comedie muzicala");
        Film f3 = new Film("Comedie");
        Film f4 = new Film("Film de comedie");
        Film f5 = new Film("Muzical comic");

        Categorie categorie = new Categorie("Filme");
        Categorie categorie1 = new Categorie("Comedii");
        Categorie categorie2 = new Categorie("Muzicale");
        Categorie categorie3 = new Categorie("Filme de actiune");

        categorie.adaugaNod(categorie1);
        categorie.adaugaNod(categorie3);
        categorie1.adaugaNod(categorie2);

        categorie3.adaugaNod(f1);
        categorie2.adaugaNod(f2);
        categorie2.adaugaNod(f5);
        categorie1.adaugaNod(f3);
        categorie1.adaugaNod(f4);

        categorie.printeazaDescriere("");
    }
}
