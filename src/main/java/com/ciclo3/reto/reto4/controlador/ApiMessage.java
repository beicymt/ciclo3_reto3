package com.ciclo3.reto.reto4.controlador;

import com.ciclo3.reto.reto4.entidad.Message;
import com.ciclo3.reto.reto4.servicio.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message/")
@CrossOrigin(origins = "*")

public class ApiMessage {
    @Autowired
    private MessageService service;

    @GetMapping( "/all")
    public List<Message> getMessages(){
    return service.getMessages();
    }

    @GetMapping("/{id}")
    public Message getMessage(@PathVariable long idMessage) {
        return service.getMessage(idMessage);
    }

    @PostMapping("/save")
    public ResponseEntity saveMessage(@RequestBody Message message){
        service.saveMessage(message);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/update")
    public ResponseEntity updateMessage(@RequestBody Message message){
        service.updateMessage(message);
        return ResponseEntity.status(201).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteMessage(@PathVariable long idMessage) {
        service.deleteMessage(idMessage);
        return ResponseEntity.status(204).build();
    }

}
