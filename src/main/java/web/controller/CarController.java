package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        if (count < 5)
             model.addAttribute("cars", carService.getCarList().subList(0, count));
        else model.addAttribute("cars", carService.getCarList());
        return "cars";
    }
}
