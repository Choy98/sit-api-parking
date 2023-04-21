package com.parking.apiparking.controller;

import com.parking.apiparking.entities.Car;
import com.parking.apiparking.services.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parking") //parking

public class ParkingController {
    // INYECCION DE DEPENDENCIAS

  private final ParkingService parkingService;
    @Autowired
    public ParkingController(ParkingService parkingService){
       this.parkingService = parkingService;
   }
    /// GET : http://dominio/parking/cars  Obtener la lista de carros
   @GetMapping("/cars")
   public List getAllCars(){
        return this.parkingService.getAllCars();
   }

   //POST: http://dominio/parking/cars
    @PostMapping("/cars")
    public ResponseEntity<Car> addCar(@RequestBody Car car){
        this.parkingService.addCar(car);
        return new ResponseEntity<>(car, HttpStatus.CREATED);
    }


}
