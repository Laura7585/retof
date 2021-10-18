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
public class ReservationRepository {
     @Autowired
    
    private ReservationInterface crud;
    
    public List<Reservation> getAll(){
        return (List<Reservation>) crud.findAll();
    }
    
    public Optional <Reservation> getReservations (int id){
        return crud.findById(id);
    }
    
    public Reservation save (Reservation reservation){
        return crud.save(reservation);
    }
    
    public void delete(Reservation reservation){
        crud.delete(reservation);
    }
}
