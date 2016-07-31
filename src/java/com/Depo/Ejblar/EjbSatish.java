/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Depo.Ejblar;

import com.Depo.Entity.Satish;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author expertoid
 */
@Stateful
public class EjbSatish {
    
    @PersistenceContext (name = "DepoPU")
    EntityManager em;
    
    public void Save(Satish satish){
        em.persist(satish);
    }
    public void Update(Satish satish){
        em.merge(satish);
    }
    public void Delete (Satish satish){
        em.remove(satish);
    }
    public List<Satish> ListOfSatish(){
        return em.createNamedQuery("Satish.findAll", Satish.class).getResultList();
    }
}
