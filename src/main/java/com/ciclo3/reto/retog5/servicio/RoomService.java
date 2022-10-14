package com.ciclo3.reto.retog5.servicio;

import com.ciclo3.reto.retog5.entidad.Room;
import com.ciclo3.reto.retog5.repositorio.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RoomService {
    @Autowired
    private RoomRepository repository;

    /** Peticion GET Mostrar datos
     */
    public List<Room> getRooms(){
        return repository.findAll();
    }

    /** Peticion POST Guardar datos
     */
    public Room saveRoom(Room room){
        return repository.save(room);
    }

}
