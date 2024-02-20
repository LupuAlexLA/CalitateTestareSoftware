package implementare_solid_chat_gpt.after.ISP;

import java.util.List;

public class SimpleReportGenerator implements ReportGenerator {
    @Override
    public void generateReport(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getMake() + " " + car.getModel() + " - " + car.getType());
        }
    }
}
