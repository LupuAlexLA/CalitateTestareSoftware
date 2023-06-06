import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CsvHandler {
    private static final String FILE_NAME = "km_masina.csv";
    private static final String HEADER = "id,data,kmInitiali,kmFinali,kmParcursi\n";

    public CsvHandler() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                FileWriter writer = new FileWriter(FILE_NAME, true);
                writer.write(HEADER);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void insertKmMasina(KmMasina kmMasina) {
        try {
            FileWriter writer = new FileWriter(FILE_NAME, true);
            writer.write(kmMasina.getId() + "," +
                    kmMasina.getData() + "," +
                    kmMasina.getKmInitiali() + "," +
                    kmMasina.getKmFinali() + "," +
                    kmMasina.getKmParcursi() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateKmMasina(KmMasina masinaToUpdate) {
        List<KmMasina> masinas = getAllKmMasina();
        for (KmMasina masina : masinas) {
            if (masina.getId() == masinaToUpdate.getId()) {
                masina.setData(masinaToUpdate.getData());
                masina.setKmInitiali(masinaToUpdate.getKmInitiali());
                masina.setKmFinali(masinaToUpdate.getKmFinali());
                masina.setKmParcursi(masinaToUpdate.getKmParcursi());
                break;
            }
        }

        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write(HEADER);
            for (KmMasina masina : masinas) {
                writer.write(masina.getId() + "," +
                        masina.getData() + "," +
                        masina.getKmInitiali() + "," +
                        masina.getKmFinali() + "," +
                        masina.getKmParcursi() + "\n"
                );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<KmMasina> getAllKmMasina() {
        List<KmMasina> kmMasini = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            br.readLine();
            while ((line = br.readLine()) != null) {
                System.out.println("Parsing line: " + line);
                String[] data = line.split(",");
                KmMasina masina = new KmMasina(Long.parseLong(data[0]), LocalDateTime.parse(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]));
                kmMasini.add(masina);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return kmMasini;
    }


}