package com.ciclo3.reto.retog5.servicio;


import com.ciclo3.reto.retog5.entidad.Message;
import com.ciclo3.reto.retog5.repositorio.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;

    /** Peticion GET Mostrar datos del mensaje
     */
    public List<Message> getMessages(){
        return repository.findAll();
    }

    /** Peticion POST Guardar datos del mensaje
     */
    public Message saveMessage(Message message){
        return repository.save(message);
    }
}
