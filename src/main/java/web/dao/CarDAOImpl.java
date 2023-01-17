package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{
//    @Override
//    public List<Car> init() {
//        List<Car> carList = new ArrayList<>();
//        for (int i = 1; i < 16; i++) {
//            carList.add(new Car("Car N" + i, (79 + i*2), String.valueOf(i)));
//        }
//        return carList;
//    }

    private List<Car> carList = new ArrayList<>();


    @Override
    public void add(Car car) {
        carList.add(car);
    }

    @Override
    public List<Car> listCar() {
        return carList;
    }

    @Override
    public List<Car> getCars(int count, List<Car> allCar) {
        return (count >= 5) ? allCar : allCar.subList(0, count);
    }
}
