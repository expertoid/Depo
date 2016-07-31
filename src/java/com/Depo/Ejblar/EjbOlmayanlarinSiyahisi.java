/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Depo.Ejblar;

import com.Depo.Entity.OlmayanlarinSiyahisi;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author expertoid
 */
@Stateful
public class EjbOlmayanlarinSiyahisi {
    
    @PersistenceContext(name = "DepoPU")
    EntityManager em;
    
    public void Save(OlmayanlarinSiyahisi olSiyahi){
        em.persist(olSiyahi);
    }
    public void Update(OlmayanlarinSiyahisi olSiyahisi){
        em.merge(olSiyahisi);
    }
    public void Delete(OlmayanlarinSiyahisi olSiyahisi){
        em.remove(olSiyahisi);
    }
    public List<OlmayanlarinSiyahisi> ListOfOlSiyahi(){
        return em.createNamedQuery("OlmayanlarinSiyahisi.findAll", OlmayanlarinSiyahisi.class).getResultList();
    }
}
