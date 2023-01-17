package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {

    void add(Car car);

    List<Car> listCar();

    List<Car> getCarList(int count, List<Car> allCar);
}
