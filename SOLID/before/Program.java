package implementare_solid_chat_gpt.before;

public class Program {
    public static void main(String[] args) {
        CarManagement carManagement = new CarManagement();

        // Adăugăm câteva mașini în sistem
        carManagement.addCar("Electric", "Tesla", "Model S");
        carManagement.addCar("Non-Electric", "Ford", "Focus");

        // Calculăm și afișăm taxa pentru o mașină electrică și una non-electrică
        double electricCarTax = carManagement.calculateTax("Electric");
        System.out.println("Tax for Electric car: " + electricCarTax);

        double nonElectricCarTax = carManagement.calculateTax("Non-Electric");
        System.out.println("Tax for Non-Electric car: " + nonElectricCarTax);

        // Generăm rapoarte pentru ambele tipuri de mașini
        carManagement.generateReport("Electric");
        carManagement.generateReport("Non-Electric");
    }
}
