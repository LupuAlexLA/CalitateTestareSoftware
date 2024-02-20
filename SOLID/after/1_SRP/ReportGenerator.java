package implementare_solid_chat_gpt.after.SRP;

import java.util.List;

public class ReportGenerator {
    public void generateReport(List<Car> cars) {
        System.out.println("Generating report for all cars:");
        for (Car car : cars) {
            System.out.println(car.getMake() + " " + car.getModel() + " - " + car.getCarType());
        }
    }
}
