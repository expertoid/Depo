/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Depo.Ejblar;

import com.Depo.Entity.Depo;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author expertoid
 */
@Stateful
public class EjbDepo {
    @PersistenceContext(name = "DepoPU")
    EntityManager em;
    
    public void Save(Depo depo){
        em.persist(depo);
    }
    public void Update (Depo depo){
        em.merge(depo);
    }
    public void Delete (Depo depo){
        em.remove(depo);
    }
    public List<Depo> ListOfDepo(){
        return em.createNamedQuery("Depo.findAll", Depo.class).getResultList();
    }
}
