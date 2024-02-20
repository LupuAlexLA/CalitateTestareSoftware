package implementare_solid_chat_gpt.after.DIP;

import java.util.List;

public class ConsoleReportService implements ReportService {
    @Override
    public void generateReport(List<Car> cars) {
        cars.forEach(car -> System.out.println(car.getMake() + " " + car.getModel() + " - " + car.getType()));
    }
}
