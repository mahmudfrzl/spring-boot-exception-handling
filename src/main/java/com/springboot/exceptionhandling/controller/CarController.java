package com.springboot.exceptionhandling.controller;

import com.springboot.exceptionhandling.dto.CarDto;
import com.springboot.exceptionhandling.exception.ModelNotFoundException;
import com.springboot.exceptionhandling.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping
    public ResponseEntity<CarDto>  getCar(@RequestParam String name){
        return ResponseEntity.ok(carService.getCar(name));
    }
//    @ExceptionHandler({ModelNotFoundException.class})
//    public String modelNotFound(){
//        return "Model not found";
//    }

}
