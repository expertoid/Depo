/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Depo.Ejblar;

import com.Depo.Entity.Firma;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author expertoid
 */
@Stateful
public class EjbFirma {
    
    @PersistenceContext(name = "DepoPU")
    EntityManager em;
    
    public void Save(Firma firma){
        em.persist(firma);
    }
    public void Update(Firma firma){
        em.merge(firma);
    }
    public void Delete(Firma firma){
        em.remove(firma);
    }
    public List<Firma> ListOfFirma(){
        return em.createNamedQuery("Firma.findAll", Firma.class).getResultList();
    }
}
