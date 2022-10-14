package com.ciclo3.reto.retog5.controlador;

import com.ciclo3.reto.retog5.entidad.Client;
import com.ciclo3.reto.retog5.servicio.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client/")
@CrossOrigin(origins = "*")

public class ApiClient {
    @Autowired
    private ClientService service;

    @GetMapping( "/all")
    public List<Client> getClients(){
        return service.getClients();
    }

    @PostMapping("/save")
    public ResponseEntity saveClient(@RequestBody Client client){
        service.saveClient(client);
    return ResponseEntity.status(201).build();
    }
}
