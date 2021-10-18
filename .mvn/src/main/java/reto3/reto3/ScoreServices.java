/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3.reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Laura
 */
@Service
public class ScoreServices {
    @Autowired
    private ScoreServices metodosCrud;
    
    public List<Score> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Score> getScore(int id){
        return metodosCrud.getScore(id);
    }
    
    public Score save(Score score){
        if(score.getIdScore()==null){
            return metodosCrud.save(score);
        }else{
            Optional<Score> evt=metodosCrud.getScore(score.getIdScore());
            if(evt.isEmpty()){
                return metodosCrud.save(score);
            }else{
                return score;
            }
        }
    }
}
