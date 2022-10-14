package com.ciclo3.reto.retog5.controlador;

import com.ciclo3.reto.retog5.entidad.Room;
import com.ciclo3.reto.retog5.servicio.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Room/")

public class ApiRoom {
    @Autowired
    private RoomService service;

    @GetMapping( "/all")
    public List<Room> findAllRooms(){
        return service.getRooms();
    }

    @PostMapping("/save")
    public ResponseEntity saveRoom(@RequestBody Room room){
        service.saveRoom(room);
        return  ResponseEntity.status(201).build();
    }

}
