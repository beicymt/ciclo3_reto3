package com.ciclo3.reto.retog5.repositorio;

import com.ciclo3.reto.retog5.entidad.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
