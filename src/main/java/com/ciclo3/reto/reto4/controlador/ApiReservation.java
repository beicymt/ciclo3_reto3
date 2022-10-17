package com.ciclo3.reto.reto4.controlador;

import com.ciclo3.reto.reto4.entidad.Reservation;
import com.ciclo3.reto.reto4.servicio.ReservationService;
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

    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable long idReservation) {
        return service.getReservation(idReservation);
    }
    @PostMapping("/save")
    public ResponseEntity saveReservation(@RequestBody Reservation reservation) {
        service.saveReservation(reservation);
        return ResponseEntity.status(201).build();
    }
    @PutMapping("/update")
    public ResponseEntity updateReservation(@RequestBody Reservation reservation) {
        service.updateReservation(reservation);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteReservation(@PathVariable long idReservation) {
        service.deleteReservation(idReservation);
        return ResponseEntity.status(204).build();
    }
}
