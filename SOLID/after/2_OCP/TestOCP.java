package implementare_solid_chat_gpt.after.OCP;

public class TestOCP {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "Model S", new ElectricCarTaxCalculator());
        Car ford = new Car("Ford", "Focus", new NonElectricCarTaxCalculator());

        System.out.println("Tax for Tesla: " + tesla.calculateTax());
        System.out.println("Tax for Ford: " + ford.calculateTax());

        ReportGenerator reportGenerator = new SimpleReportGenerator();
        reportGenerator.generateReport(tesla);
        reportGenerator.generateReport(ford);
    }
}
