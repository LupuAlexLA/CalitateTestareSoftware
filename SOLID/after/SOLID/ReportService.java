package implementare_solid_chat_gpt.after.SOLID;
import java.util.List;
// Abstracție pentru gestionarea mașinilor (SRP & DIP)
public interface ReportService {
    void generateReport(List<Car> cars);
}
