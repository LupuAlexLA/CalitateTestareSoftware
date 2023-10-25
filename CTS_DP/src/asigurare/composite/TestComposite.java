package asigurare.composite;

public class TestComposite {
    public static void main(String[] args) {
        Structura structuraEuropa = new Structura("Sucursala centrala Europa");

        //definire structuri inferioare
        Structura structura1 = new Structura("Sucursala centrala Romania");
        Structura structura2 = new Structura("Sucursala centrala Italia");

        //definire noduri structura nivelul 3
        Structura structura3 = new Structura("Sucursala Bucuresti");
        structura3.adaugaNod(new Angajat("Popescu Ana", "Manager Bucuresti"));

        Structura structura4 = new Structura("Sucursala Timisoara");
        structura4.adaugaNod(new Angajat("Popescu Matei", "Manager Timisoara"));

        //adaugare angajat pe nivelul 2
        structura1.adaugaNod(structura3);
        structura1.adaugaNod(structura4);

        //adaugare legatura intre nod initial si nodurile de pe nivelul 2
        structuraEuropa.adaugaNod(structura1);
        structuraEuropa.adaugaNod(structura2);

        //structura Europa
        System.out.println(structuraEuropa.getInfo());

        //structura Romania
        System.out.println(structura1.getInfo());
    }
}
