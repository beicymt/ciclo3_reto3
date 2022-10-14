package com.ciclo3.reto.retog5.controlador;

import com.ciclo3.reto.retog5.entidad.Reservation;
import com.ciclo3.reto.retog5.servicio.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Reservation/")

public class ApiReservation {
    @Autowired
    private ReservationService service;

    @GetMapping("/all")
    public List<Reservation> getReservations(){
        return service.getReservations();
    }

    @PostMapping("/save")
    public ResponseEntity saveReservation(@RequestBody Reservation reservation) {
        service.saveReservation(reservation);
        return ResponseEntity.status(201).build();
    }
}
