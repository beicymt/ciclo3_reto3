package com.ciclo3.reto.reto4.servicio;


import com.ciclo3.reto.reto4.entidad.Message;
import com.ciclo3.reto.reto4.repositorio.MessageRepository;
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

    public Message getMessage(long id){
        return repository.findById(id).orElse(null);
    }

    /** Peticion POST Guardar datos del mensaje
     */
    public Message saveMessage(Message message){
        return repository.save(message);
    }

    //PUT = UPDATE
    public Message updateMessage(Message messageUpd){
        Message messageOld = getMessage(messageUpd.getIdMessage());
        messageOld.setMessageText(messageUpd.getMessageText());
        return repository.save(messageOld);
    }
    //DELETE
    public void deleteMessage(long idMessage){
        repository.deleteById(idMessage);
    }

}
