package implementare_solid_chat_gpt.before;

public class CarManagement {
    public void addCar(String carType, String make, String model) {
        // Logica de adăugare a unei mașini în inventar
        System.out.println("Adding " + carType + " car: " + make + " " + model);
        // Presupuneți că aici avem cod pentru salvarea detaliilor mașinii într-o bază de date
    }

    public double calculateTax(String carType) {
        // Logica de calculare a taxei pentru mașină, bazată pe tip
        if (carType.equals("Electric")) {
            return 100; // Taxă fixă pentru mașinile electrice
        } else {
            return 200; // Taxă pentru mașinile non-electrice
        }
    }

    public void generateReport(String carType) {
        // Logica de generare a unui raport pentru mașini, bazată pe tip
        if (carType.equals("Electric")) {
            System.out.println("Generating report for Electric cars");
            // Mai multă logică aici
        } else {
            System.out.println("Generating report for Non-Electric cars");
            // Mai multă logică aici
        }
    }
}
