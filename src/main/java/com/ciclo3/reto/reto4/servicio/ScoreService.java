package com.ciclo3.reto.reto4.servicio;

import com.ciclo3.reto.reto4.entidad.Score;
import com.ciclo3.reto.reto4.repositorio.ScoreRepository;
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

    public Score getScore(long id){
        return repository.findById(id).orElse(null);
    }

    /** Peticion POST = Guardar datos
     */
    public Score saveScore(Score score) {
        return repository.save(score);
    }

    //PUT = UPDATE
    public Score updateScore(Score scoreUpd) {
        Score scoreOld = getScore(scoreUpd.getIdScore());
        scoreOld.setMessageText(scoreUpd.getMessageText());
        scoreOld.setStars(scoreUpd.getStars());
        return repository.save(scoreOld);
    }

    //DELETE
    public void deleteScore(long idScore){
        repository.deleteById(idScore);
    }
}
