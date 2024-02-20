package implementare_solid_chat_gpt.after.DIP;

import java.util.List;

public interface CarRepository {
    void addCar(Car car);
    List<Car> getAllCars();
}
