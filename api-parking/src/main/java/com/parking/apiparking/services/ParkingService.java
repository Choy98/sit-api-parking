package com.parking.apiparking.services;

import com.parking.apiparking.entities.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingService {

    private List<Car> parkingLot;

    public ParkingService(){
        this.parkingLot = new ArrayList<>();
    }
    ///TODO:Como usuario quiero poder ver la lista de todos los autos estacionados
    /// en el parqueo, para tener una vision general del estado actual del estacionamiento


    public List<Car> getAllCars() {
        return parkingLot;
    }

    //Todo: Como usuario quiero poder agregar un auto al parqueo, para estacionar el vehiculo

    public void addCar(Car car) {
        this.parkingLot.add(car);
    }
}
