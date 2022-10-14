package com.ciclo3.reto.retog5.servicio;

import com.ciclo3.reto.retog5.entidad.Reservation;
import com.ciclo3.reto.retog5.repositorio.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ReservationService {
    @Autowired
    private ReservationRepository repository;

    /** Peticion GET = Mostrar datos
     */
    public List<Reservation> getReservations() {
        return repository.findAll();
    }

    /** Peticion POST Guardar datos
     */
    public Reservation saveReservation(Reservation reservation){
        return repository.save(reservation);
    }
}
