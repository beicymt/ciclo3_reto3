package com.ciclo3.reto.retog5.servicio;

import com.ciclo3.reto.retog5.entidad.Client;
import com.ciclo3.reto.retog5.repositorio.ClientRepository;
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

    /** Peticion POST Guardar datos
     */
    public Client saveClient(Client client){
        return repository.save(client); }
}
