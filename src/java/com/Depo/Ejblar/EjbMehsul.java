/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Depo.Ejblar;

import com.Depo.Entity.Mehsul;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author expertoid
 */
@Stateful
public class EjbMehsul {

    @PersistenceContext(name = "DepoPU")
    EntityManager em;
    
    public void Save (Mehsul mehsul){
        em.persist(mehsul);
        
    }
    public void Update (Mehsul mehsul){
        em.merge(mehsul);
    }
    public void Delete (Mehsul mehsul){
        em.remove(mehsul);
    }
    public List<Mehsul> ListOfMehsul (){
        return em.createNamedQuery("Mehsul.findAll", Mehsul.class).getResultList();
    }
}
