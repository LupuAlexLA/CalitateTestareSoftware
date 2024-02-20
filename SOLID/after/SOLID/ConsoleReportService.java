package implementare_solid_chat_gpt.after.SOLID;
import java.util.List;
// Serviciu de generare a rapoartelor în consolă (OCP, LSP)
public class ConsoleReportService implements ReportService {
    @Override
    public void generateReport(List<Car> cars) {
        cars.forEach(car -> System.out.println(car.getMake() + " " + car.getModel() + " - " + car.getType()));
    }
}
