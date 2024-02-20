package implementare_solid_chat_gpt.after.SOLID;
import java.util.List;
// Clasa Main demonstrează injectarea dependențelor (DIP) și utilizarea interfețelor segregate (ISP)
public class TestSOLID {
    public static void main(String[] args) {
        CarRepository carRepository = new InMemoryCarRepository();
        TaxService taxService = new SimpleTaxService();
        ReportService reportService = new ConsoleReportService();

        Car tesla = new Car("Electric", "Tesla", "Model S");
        Car ford = new Car("Non-Electric", "Ford", "Focus");

        carRepository.addCar(tesla);
        carRepository.addCar(ford);

        List<Car> cars = carRepository.getAllCars();
        cars.forEach(car -> System.out.println("Tax for " + car.getMake() + ": " + taxService.calculateTax(car)));

        reportService.generateReport(cars);
    }
}
