package com.ciclo3.reto.retog5.servicio;

import com.ciclo3.reto.retog5.entidad.Category;
import com.ciclo3.reto.retog5.repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    /** Peticion GET Mostrar datos
     */
    public List<Category> getCategories(){
        return repository.findAll();
    }

    /** Peticion POST Guardar datos
     */
    public Category saveCategory(Category category){
        return repository.save(category);
    }

}

