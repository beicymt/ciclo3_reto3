package com.ciclo3.reto.retog5.repositorio;

import com.ciclo3.reto.retog5.entidad.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
