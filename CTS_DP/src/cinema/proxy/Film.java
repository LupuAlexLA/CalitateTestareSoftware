package cinema.proxy;

import java.io.*;

public class Film implements IFilm{
    private String denumire;
    private String sala;
    private int anAparitie;
    private String regizor;
    private String[] actori;

    public Film(String denumire, String sala) {
        super();
        this.denumire = denumire;
        this.sala = sala;
        incarcaFilmDinArhiva(denumire);
    }

    private void incarcaFilmDinArhiva(String denumireFilm) {
        File file = new File(denumireFilm + ".txt");
        FileReader readerFile = null;
        try {
            readerFile = new FileReader(file);
            BufferedReader reader = new BufferedReader(readerFile);
            anAparitie = Integer.parseInt(reader.readLine());
            regizor = reader.readLine();
            int nrActori = Integer.parseInt(reader.readLine());
            actori = new String[nrActori];
            for(int i = 0; i < nrActori; i++) {
                actori[i] = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            readerFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Filmul " + denumireFilm + " este adus din arhiva in memorie");
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public void ruleazaFilm() {
        System.out.println("Filmul " + denumire + " a inceput in sala " + sala);
        System.out.println("Filmul a aparut in anul " + anAparitie +
                " si este regizat de " + regizor);
        StringBuilder actoriString = new StringBuilder();
        for(String actor: actori) {
            actoriString.append(actor).append(";");
        }
        System.out.println("Distributia este compusa din: " + actoriString);
    }
}







