/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Depo.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author expertoid
 */
@Entity
@Table(name = "Satish")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Satish.findAll", query = "SELECT s FROM Satish s"),
    @NamedQuery(name = "Satish.findByIdSatish", query = "SELECT s FROM Satish s WHERE s.idSatish = :idSatish"),
    @NamedQuery(name = "Satish.findBySatishTarixi", query = "SELECT s FROM Satish s WHERE s.satishTarixi = :satishTarixi"),
    @NamedQuery(name = "Satish.findByKimSatib", query = "SELECT s FROM Satish s WHERE s.kimSatib = :kimSatib"),
    @NamedQuery(name = "Satish.findByKimQebulEdib", query = "SELECT s FROM Satish s WHERE s.kimQebulEdib = :kimQebulEdib")})
public class Satish implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSatish")
    private Integer idSatish;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SatishTarixi")
    private String satishTarixi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "KimSatib")
    private String kimSatib;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "KimQebulEdib")
    private String kimQebulEdib;
    @JoinColumn(name = "idDepo", referencedColumnName = "idDepo")
    @ManyToOne(optional = false)
    private Depo idDepo;

    public Satish() {
    }

    public Satish(Integer idSatish) {
        this.idSatish = idSatish;
    }

    public Satish(Integer idSatish, String satishTarixi, String kimSatib, String kimQebulEdib) {
        this.idSatish = idSatish;
        this.satishTarixi = satishTarixi;
        this.kimSatib = kimSatib;
        this.kimQebulEdib = kimQebulEdib;
    }

    public Integer getIdSatish() {
        return idSatish;
    }

    public void setIdSatish(Integer idSatish) {
        this.idSatish = idSatish;
    }

    public String getSatishTarixi() {
        return satishTarixi;
    }

    public void setSatishTarixi(String satishTarixi) {
        this.satishTarixi = satishTarixi;
    }

    public String getKimSatib() {
        return kimSatib;
    }

    public void setKimSatib(String kimSatib) {
        this.kimSatib = kimSatib;
    }

    public String getKimQebulEdib() {
        return kimQebulEdib;
    }

    public void setKimQebulEdib(String kimQebulEdib) {
        this.kimQebulEdib = kimQebulEdib;
    }

    public Depo getIdDepo() {
        return idDepo;
    }

    public void setIdDepo(Depo idDepo) {
        this.idDepo = idDepo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSatish != null ? idSatish.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Satish)) {
            return false;
        }
        Satish other = (Satish) object;
        if ((this.idSatish == null && other.idSatish != null) || (this.idSatish != null && !this.idSatish.equals(other.idSatish))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Depo.Entity.Satish[ idSatish=" + idSatish + " ]";
    }
    
}
