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
public class CategoryRepository {
    
    @Autowired
    private CategoryInterface crud;
    
    public List<Category> getAll(){
        return (List<Category>) crud.findAll();
    }
    
    public Optional <Category> getCategories (int id){
        return crud.findById(id);
    }
    
    public Category save (Category category){
        return crud.save(category);
    }
    
    public void delete(Category Category){
       crud.delete(Category);
    }
}
