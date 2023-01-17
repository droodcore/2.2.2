package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarDAOImpl carDAO;

//    @Autowired
//    public CarServiceImpl(CarDAOImpl carDAO) {
//        this.carDAO = carDAO;
//    }

    {
        carDAO = new CarDAOImpl();

        carDAO.add((new Car("One",1,"Misha")));
        carDAO.add((new Car("Two",2,"Kolya")));
        carDAO.add((new Car("Three",3,"Vasya")));
        carDAO.add((new Car("Four",4,"Kesha")));
        carDAO.add((new Car("Five",5,"Gennadiy")));
    }


    @Override
    public void add(Car car) {
        carDAO.add(car);
    }

    @Override
    public List<Car> listCar() {
        return carDAO.listCar();
    }

    @Override
    public List<Car> getCarList(int count, List<Car> allCar) {
        return carDAO.getCars(count, allCar);
    }



//    @Override
//    public List<Car> getCarList() {
//        return carDAO.init();
//    }
}
