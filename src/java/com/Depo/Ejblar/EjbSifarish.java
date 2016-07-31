/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Depo.Ejblar;

import com.Depo.Entity.Sifarish;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author expertoid
 */
@Stateful
public class EjbSifarish {
    
    @PersistenceContext (name = "DepoPU")
    EntityManager em;
    
    public void Save (Sifarish sifarish){
        em.persist(sifarish);
    }
    public void Update (Sifarish sifarish){
        em.merge(sifarish);
    }
    public void Delete (Sifarish sifarish){
        em.remove(sifarish);
    }
    public List<Sifarish> ListOfSifarish(){
        return em.createNamedQuery("Sifarish.findAll", Sifarish.class).getResultList();
    }
}
