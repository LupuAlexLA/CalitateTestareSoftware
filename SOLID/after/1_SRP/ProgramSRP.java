package implementare_solid_chat_gpt.after.SRP;

public class ProgramSRP {
    public static void main(String[] args) {
        CarInventory carInventory = new CarInventory();
        TaxCalculator taxCalculator = new TaxCalculator();
        ReportGenerator reportGenerator = new ReportGenerator();

        Car tesla = new Car("Electric", "Tesla", "Model S");
        Car ford = new Car("Non-Electric", "Ford", "Focus");

        carInventory.addCar(tesla);
        carInventory.addCar(ford);

        System.out.println("Tax for Tesla: " + taxCalculator.calculateTax(tesla));
        System.out.println("Tax for Ford: " + taxCalculator.calculateTax(ford));

        reportGenerator.generateReport(carInventory.getCars());
    }
}
