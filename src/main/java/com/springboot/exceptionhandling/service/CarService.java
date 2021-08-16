package com.springboot.exceptionhandling.service;

import com.springboot.exceptionhandling.dto.CarDto;
import com.springboot.exceptionhandling.exception.ModelNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private static List<CarDto> cars = new ArrayList<>();

    @PostConstruct
    public void init(){
        cars.add(new CarDto("Car A","Brand 1"));
        cars.add(new CarDto("Car B","Brand 2"));
        cars.add(new CarDto("Car C","Brand 3"));
    }
    public CarDto getCar(String name){
        if(name.startsWith("1")){
            throw new IllegalArgumentException();
        }
        return cars.stream()
                .filter(item->item.equals(name))
                .findFirst()
                .orElseThrow(()->new ModelNotFoundException(name));
    }

}
