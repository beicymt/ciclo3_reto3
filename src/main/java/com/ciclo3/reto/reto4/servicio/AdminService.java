package com.ciclo3.reto.reto4.servicio;

import com.ciclo3.reto.reto4.entidad.Admin;
import com.ciclo3.reto.reto4.repositorio.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AdminService {
    @Autowired
    private AdminRepository repository;

    /** Peticion GET = Mostrar datos
     */
    public List<Admin> getAdmins(){
        return repository.findAll();
    }

    public Admin getAdmin(long idAdmin) {
        return repository.findById(idAdmin).orElse(null);}

    /** Peticion POST = Guardar datos
     */

    public Admin saveAdmin(Admin admin) {
        return repository.save(admin);
    }

    //PUT = UPDATE
    public Admin updateAdmin(Admin adminUpd) {
        Admin adminOld = getAdmin(adminUpd.getIdAdmin());
        adminOld.setEmail(adminUpd.getEmail());
        adminOld.setPassword(adminUpd.getPassword());
        adminOld.setName(adminUpd.getName());
        return repository.save(adminOld);
    }

    //DELETE
    public void deleteAdmin(long idAdmin){
        repository.deleteById(idAdmin);
    }

}
