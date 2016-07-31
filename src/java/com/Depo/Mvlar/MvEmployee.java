/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Depo.Mvlar;

import com.Depo.Ejblar.EjbEmployee;
import com.Depo.Entity.Employee;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author expertoid
 */
q@ManagedBean(name = "MvEmployee")
@SessionScoped
public class MvEmployee {
    
    @EJB
    EjbEmployee ejbEmployee;
    
    private Employee selectedEmp;
    private List<Employee> ListOfEmployee;
    private boolean done = false;

    public Employee getSelectedEmp() {
        return selectedEmp;
    }

    public void setSelectedEmp(Employee selectedEmp) {
        this.selectedEmp = selectedEmp;
    }

    public List<Employee> getListOfEmployee() {
        return ListOfEmployee;
    }

    public void setListOfEmployee(List<Employee> ListOfEmployee) {
        this.ListOfEmployee = ListOfEmployee;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public MvEmployee() {
        done = false;
    }
    public void New(){
        selectedEmp = new Employee(0);
        done = true;
    }
    public void Save(){
        ejbEmployee.Save(selectedEmp);
        done = !done;
        selectedEmp = null;
    }
    
}
