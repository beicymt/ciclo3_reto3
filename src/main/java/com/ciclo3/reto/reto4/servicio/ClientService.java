package com.ciclo3.reto.reto4.servicio;

import com.ciclo3.reto.reto4.entidad.Client;
import com.ciclo3.reto.reto4.repositorio.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClientService {
    @Autowired
    private ClientRepository repository;

    /** Peticion GET Mostrar datos
     */
    public List<Client> getClients(){
        return repository.findAll();
    }
    public Client getClient(long id){
        return repository.findById(id).orElse(null);
    }

    /** Peticion POST Guardar datos
     */
    public Client saveClient(Client client){
        return repository.save(client); }

    //PUT = UPDATE
    public Client updateClient(Client clientUpd){
        Client clientOld = getClient(clientUpd.getIdClient());
        clientOld.setEmail(clientUpd.getEmail());
        clientOld.setPassword(clientUpd.getPassword());
        clientOld.setName(clientUpd.getName());
        clientOld.setAge(clientUpd.getAge());
        return repository.save(clientOld);
    }

    //DELETE
    public void deleteClient(long id){
        repository.deleteById(id);
    }

}
