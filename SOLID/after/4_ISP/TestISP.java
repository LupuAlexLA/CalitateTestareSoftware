package implementare_solid_chat_gpt.after.ISP;

import java.util.ArrayList;
import java.util.List;

public class TestISP {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        CarAdder carAdder = new SimpleCarAdder(carList);
        TaxCalculator taxCalculator = new SimpleTaxCalculator();
        ReportGenerator reportGenerator = new SimpleReportGenerator();

        Car tesla = new Car("Electric", "Tesla", "Model S");
        Car ford = new Car("Non-Electric", "Ford", "Focus");

        carAdder.addCar(tesla);
        carAdder.addCar(ford);

        System.out.println("Tax for Tesla: " + taxCalculator.calculateTax(tesla));
        System.out.println("Tax for Ford: " + taxCalculator.calculateTax(ford));

        reportGenerator.generateReport(carList);
    }
}
