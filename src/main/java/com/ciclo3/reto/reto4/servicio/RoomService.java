package com.ciclo3.reto.reto4.servicio;

import com.ciclo3.reto.reto4.entidad.Room;
import com.ciclo3.reto.reto4.repositorio.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RoomService {
    @Autowired
    private RoomRepository repository;

    /**
     * Peticion GET Mostrar datos
     */
    public List<Room> getRooms() {
        return repository.findAll();
    }

    public Room getRoom(long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Peticion POST Guardar datos
     */
    public Room saveRoom(Room room) {
        return repository.save(room);
    }

    //PUT = UPDATE
    public Room updateRoom(Room roomUpd) {
        Room roomOld = getRoom(roomUpd.getId());
        roomOld.setName(roomUpd.getName());
        roomOld.setHotel(roomUpd.getHotel());
        roomOld.setStars(roomUpd.getStars());
        roomOld.setDescription(roomUpd.getDescription());
        return repository.save(roomOld);
    }
    //DELETE
    public void deleteRoom(long id) {
        repository.deleteById(id);
    }

}
