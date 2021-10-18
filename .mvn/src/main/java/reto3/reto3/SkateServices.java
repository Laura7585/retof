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
public class SkateServices {
    @Autowired
    private SkateRepository metodosCrud;
    
    public List<Skate> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Skate> getSkates(int id){
        return metodosCrud.getSkates(id);
    }
    
    public Skate save(Skate skate){
        if(skate.getId() ==null){
            return metodosCrud.save(skate);
        }else{
            Optional<Skate> evt=metodosCrud.getSkates(skate.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(skate);
            }else{
                return skate;
            }
        }
    }
    
    public Skate update(Skate skate){
        if(skate.getId()!=null){
            Optional<Skate> e=metodosCrud.getSkates(skate.getId());
            if(!e.isEmpty()){
                if(skate.getName()!=null){
                    e.get().setName(skate.getName());
                }
                if(skate.getBrand()!=null){
                    e.get().setBrand(skate.getBrand());
                }
                if(skate.getYear()!=null){
                    e.get().setYear(skate.getYear());
                }
                if(skate.getDescription()!=null){
                    e.get().setDescription(skate.getDescription());
                }
                if(skate.getCategory()!=null){
                    e.get().setCategory(skate.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return skate;
            }
        }else{
            return skate;
        }
    }


    public boolean deleteSkate(int skateId) {
        Boolean aBoolean = getSkates(skateId).map(skate -> {
            metodosCrud.delete(skate);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
