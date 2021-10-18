/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laura
 */
@Repository
public class ScoreRepository {
    @Autowired
    
    private ScoreInterface crud;
    
    public List<Score> getAll(){
        return (List<Score>) crud.findAll();
    }
    
    public Optional <Score> getScores (int id){
        return crud.findById(id);
    }
    
    public Score save (Score score){
        return crud.save(score);
    }
}
