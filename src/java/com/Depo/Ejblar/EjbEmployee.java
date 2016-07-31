/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Depo.Ejblar;

import com.Depo.Entity.Employee;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author expertoid
 */
@Stateful
public class EjbEmployee {
    @PersistenceContext(name = "DepoPU")
    EntityManager em;
    
    public void Save(Employee emp){
        em.persist(emp);
    }
    public void Update (Employee emp){
        em.merge(emp);
    }
    public void Delete (Employee emp){
        em.remove(emp);
    }
    public List<Employee> ListOfEmployee(){
        return em.createNamedQuery("Employee.findAll", Employee.class).getResultList();
    }
}
