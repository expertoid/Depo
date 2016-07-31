/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Depo.Ejblar;

import com.Depo.Entity.SifarishInfo;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author expertoid
 */
@Stateful
public class EjbSifarishInfo {
    
    @PersistenceContext (name = "DepoPU")
    EntityManager em;
    
    public void Save (SifarishInfo sifInfo){
        em.persist(sifInfo);
    }
    public void Update (SifarishInfo sifInfo){
        em.merge(sifInfo);
    }
    public void Delete (SifarishInfo sifInfo){
        em.remove(sifInfo);
    }
    public List<SifarishInfo> ListOfSifInfo(){
        return em.createNamedQuery("SifarishInfo.findAll", SifarishInfo.class).getResultList();
    }
}
