package com.ciclo3.reto.retog5.controlador;

import com.ciclo3.reto.retog5.entidad.Admin;
import com.ciclo3.reto.retog5.servicio.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
@CrossOrigin(origins = "*")

public class ApiAdmin {
    @Autowired
    private AdminService service;

    @GetMapping("/all")
    public List<Admin> getAdmins() {
        return service.getAdmins();
    }

    @PostMapping("/save")
    public ResponseEntity saveAdmin(@RequestBody Admin admin) {
        service.saveAdmin(admin);
        return ResponseEntity.status(201).build();
    }
}
