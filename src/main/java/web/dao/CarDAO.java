package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {

//    public List<Car> init();
    void add(Car car);

    List<Car> listCar();

    List<Car> getCars(int count, List<Car> allCar);
}
