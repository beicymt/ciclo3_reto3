package com.ciclo3.reto.retog5.servicio;

import com.ciclo3.reto.retog5.entidad.Score;
import com.ciclo3.reto.retog5.repositorio.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ScoreService {
    @Autowired
    private ScoreRepository repository;

    /** Peticion GET = Mostrar datos
     */
    public List<Score> getScores(){
        return repository.findAll();
    }

    /** Peticion POST = Guardar datos
     */
    public Score saveScore(Score score) {
        return repository.save(score);
    }
}
