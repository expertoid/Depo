/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Depo.Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author expertoid
 */
@Entity
@Table(name = "Firma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Firma.findAll", query = "SELECT f FROM Firma f"),
    @NamedQuery(name = "Firma.findByIdFirma", query = "SELECT f FROM Firma f WHERE f.idFirma = :idFirma"),
    @NamedQuery(name = "Firma.findByAdi", query = "SELECT f FROM Firma f WHERE f.adi = :adi"),
    @NamedQuery(name = "Firma.findByFirmaninKodu", query = "SELECT f FROM Firma f WHERE f.firmaninKodu = :firmaninKodu"),
    @NamedQuery(name = "Firma.findByTelefon", query = "SELECT f FROM Firma f WHERE f.telefon = :telefon"),
    @NamedQuery(name = "Firma.findByUnvan", query = "SELECT f FROM Firma f WHERE f.unvan = :unvan")})
public class Firma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFirma")
    private Integer idFirma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Adi")
    private String adi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "FirmaninKodu")
    private String firmaninKodu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Telefon")
    private String telefon;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Unvan")
    private String unvan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFirma")
    private Collection<Employee> employeeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFirma")
    private Collection<Mehsul> mehsulCollection;

    public Firma() {
    }

    public Firma(Integer idFirma) {
        this.idFirma = idFirma;
    }

    public Firma(Integer idFirma, String adi, String firmaninKodu, String telefon, String unvan) {
        this.idFirma = idFirma;
        this.adi = adi;
        this.firmaninKodu = firmaninKodu;
        this.telefon = telefon;
        this.unvan = unvan;
    }

    public Integer getIdFirma() {
        return idFirma;
    }

    public void setIdFirma(Integer idFirma) {
        this.idFirma = idFirma;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getFirmaninKodu() {
        return firmaninKodu;
    }

    public void setFirmaninKodu(String firmaninKodu) {
        this.firmaninKodu = firmaninKodu;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    @XmlTransient
    public Collection<Employee> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<Employee> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    @XmlTransient
    public Collection<Mehsul> getMehsulCollection() {
        return mehsulCollection;
    }

    public void setMehsulCollection(Collection<Mehsul> mehsulCollection) {
        this.mehsulCollection = mehsulCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFirma != null ? idFirma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Firma)) {
            return false;
        }
        Firma other = (Firma) object;
        if ((this.idFirma == null && other.idFirma != null) || (this.idFirma != null && !this.idFirma.equals(other.idFirma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Depo.Entity.Firma[ idFirma=" + idFirma + " ]";
    }
    
}
