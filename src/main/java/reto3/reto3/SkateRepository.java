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
public class SkateRepository {
    @Autowired
    
    private SkateInterface crud;
    
    public List<Skate> getAll(){
        return (List<Skate>) crud.findAll();
    }
    
    public Optional <Skate> getSkates (int id){
        return crud.findById(id);
    }
    
    public Skate save (Skate skate){
        return crud.save(skate);
    }
    
    public void delete(Skate skate  ){
        crud.delete(skate);
    }
}
