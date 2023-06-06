/*
Fie datele de intrare (in directorul date):

a) banca_persoane.txt: lista de persoane (cod - întreg, nume - string) - fișier text de forma:
1, Ion Testescu
2, Ana Marinescu
...
Numele de persoane nu pot conține caracterul virgulă.

b) tabelele Conturi și Transferuri din baza de date SQLite banca.db cu următoarele câmpuri:

Conturi:
NumarCont - integer, cheie primară
Sold - double
CodPersoana - integer (corespunde unui cod de persoană din fișier)

Transferuri:
NumarContSursa - integer (corespunde unui număr cont din tabela Conturi)
NumarContDestinatie - integer (corespunde unui număr cont din tabela Conturi)
Valoare - double

Să se scrie o aplicație Java care să îndeplinească următoarele cerințe:

1) Să se afișeze la consolă numărul de persoane
Punctaj: 1 punct.
Criteriu de acordare a punctajului: afișarea corectă la consolă

2) Să se afișeze la consolă lista de persoane ordonate descrescător în funcție de numărul de conturi
Punctaj: 1 punct.
Criteriu de acordare a punctajului: afișarea corectă la consolă

3) Să se afișeze la consolă o listă de forma:
Nume, Numar Cont, Sold Final

Soldul final se obține aplicând la soldul inițial din tabela Conturi operațiile specificate în tabela Transferuri.

Punctaj:
1.5 punct: afisarea listei cu soldurile finale
Criteriu de acordare a punctajului: afișarea corectă la consolă

4) Să se scrie în fișierul JSON date\banca_export.json datele disponibile în formatul:

{
 "listaConturi": [
   {
     "nume": "Ion",
     "cod": 1,
     "conturi": [
       {
         "numar": 101,
         "sold": 5000.10
       },
       {
         "numar": 102,
         "sold": 500
       }
     ]
   },
   ...
 ],
 "listaTransferuri": [
   { "sursa": 101, "destinatie":  102, "valoare": 7.5},
   { "sursa": 301, "destinatie":  101, "valoare": 1000},
   ...
 ]
}

Punctaj: 1 puncte - listaConturi + 0.5 puncte - listaTransferuri
Criteriu de acordare a punctajului: urmărirea fișierului banca_export.json
**/


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.sql.*;



final class Persoana implements  Comparable<Persoana>{
    private int cod;
    private String nume;

    public Persoana(int cod, String nume) {
        this.cod = cod;
        this.nume = nume;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


    private long numar_conturi;
    private long setnNumar_conturi(){
        return Main.conturi.stream().filter(e -> e.getCodPersoana()==cod).count();
    }

    public long getNumar_conturi() {
        return numar_conturi;
    }

    @Override
    public int compareTo(Persoana pers) {
        if(pers instanceof Persoana){
            if(numar_conturi> pers.getNumar_conturi()) return 1;
            else if(numar_conturi<pers.getNumar_conturi()) return -1;
            else return 0;
        }else return -1;
    }
}

final class Cont {
    private int NumarCod;
    private double Sold;
    private int CodPersoana;

    public Cont(int numarCod, double sold, int codPersoana) {
        NumarCod = numarCod;
        Sold = sold;
        CodPersoana = codPersoana;
    }

    public int getNumarCod() {
        return NumarCod;
    }

    public void setNumarCod(int numarCod) {
        NumarCod = numarCod;
    }

    public double getSold() {
        return Sold;
    }

    public void setSold(double sold) {
        Sold = sold;
    }

    public int getCodPersoana() {
        return CodPersoana;
    }

    public void setCodPersoana(int codPersoana) {
        CodPersoana = codPersoana;
    }

}
final class Tranzactie {
    private int sursa;
    private int destinatie;
    private double valoare;

    public Tranzactie(int sursa, int destinatie, double valoare) {
        this.sursa = sursa;
        this.destinatie = destinatie;
        this.valoare = valoare;
    }

    public int getSursa() {
        return sursa;
    }

    public void setSursa(int sursa) {
        this.sursa = sursa;
    }

    public int getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(int destinatie) {
        this.destinatie = destinatie;
    }

    public double getValoare() {
        return valoare;
    }

    public  void setValoare(double valoare) {
        this.valoare = valoare;
    }
}

class Main {

    static final String  CALE_BANCA_PERSOANE= "date\\banca_persoane.txt";
    static final String  CALE_BANCA_DB="date\\banca.db";

    static List<Persoana> persoane;
    static List<Cont> conturi=new ArrayList<>();
    static List<Tranzactie> tranzactii;


    public static void main(String args[]) throws Exception{

        try(var file = new BufferedReader(new FileReader(CALE_BANCA_PERSOANE))){
            persoane= file.lines().map(line ->new Persoana(Integer.parseInt(line.split(",")[0]),
                    line.split(",")[1] )).collect(Collectors.toList());
        }

        System.out.println("Problema 1: Numar peroane "+ persoane.size());

        try {
            Connection conectie = DriverManager.getConnection("jdbc:sqlite:date\\banca.db");
            dbdata(conectie);

        }catch (SQLException e){
            e.printStackTrace();
        }


    }

    public static  void dbdata(Connection conectie){
        String sqlSelect= "SELECT * FROM conturi";
        try {
            Statement statement= conectie.createStatement();
            ResultSet rezultat= statement.executeQuery(sqlSelect);
//NumarCont - integer, cheie primară
//Sold - double
//CodPersoana - integer (corespunde unui cod de persoană din fișier)

            while(rezultat.next()){
                int NumarCont= rezultat.getInt("NumarCont");
                double Sold=rezultat.getDouble("Sold");
                int CodPersoana=rezultat.getInt("CodPersoana");

                System.out.println(NumarCont+ " "+ Sold+ " "+CodPersoana+ " ");
                conturi.add(new Cont(NumarCont,Sold,CodPersoana));

            }
            rezultat.close();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        catch(NullPointerException ex){
            ex.printStackTrace();
        }
        persoane.stream().sorted(Collections.reverseOrder()).forEach(e -> System.out.println("Persoana " +
                e.getNume()+" cu numarul de locuri" + e.getNumar_conturi()));

    }

}
