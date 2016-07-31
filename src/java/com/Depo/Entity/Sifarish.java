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
@Table(name = "Sifarish")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sifarish.findAll", query = "SELECT s FROM Sifarish s"),
    @NamedQuery(name = "Sifarish.findByIdSifarish", query = "SELECT s FROM Sifarish s WHERE s.idSifarish = :idSifarish"),
    @NamedQuery(name = "Sifarish.findByTarixi", query = "SELECT s FROM Sifarish s WHERE s.tarixi = :tarixi"),
    @NamedQuery(name = "Sifarish.findByNomre", query = "SELECT s FROM Sifarish s WHERE s.nomre = :nomre")})
public class Sifarish implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSifarish")
    private Integer idSifarish;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Tarixi")
    private String tarixi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nomre")
    private String nomre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSifarish")
    private Collection<SifarishInfo> sifarishInfoCollection;

    public Sifarish() {
    }

    public Sifarish(Integer idSifarish) {
        this.idSifarish = idSifarish;
    }

    public Sifarish(Integer idSifarish, String tarixi, String nomre) {
        this.idSifarish = idSifarish;
        this.tarixi = tarixi;
        this.nomre = nomre;
    }

    public Integer getIdSifarish() {
        return idSifarish;
    }

    public void setIdSifarish(Integer idSifarish) {
        this.idSifarish = idSifarish;
    }

    public String getTarixi() {
        return tarixi;
    }

    public void setTarixi(String tarixi) {
        this.tarixi = tarixi;
    }

    public String getNomre() {
        return nomre;
    }

    public void setNomre(String nomre) {
        this.nomre = nomre;
    }

    @XmlTransient
    public Collection<SifarishInfo> getSifarishInfoCollection() {
        return sifarishInfoCollection;
    }

    public void setSifarishInfoCollection(Collection<SifarishInfo> sifarishInfoCollection) {
        this.sifarishInfoCollection = sifarishInfoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSifarish != null ? idSifarish.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sifarish)) {
            return false;
        }
        Sifarish other = (Sifarish) object;
        if ((this.idSifarish == null && other.idSifarish != null) || (this.idSifarish != null && !this.idSifarish.equals(other.idSifarish))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Depo.Entity.Sifarish[ idSifarish=" + idSifarish + " ]";
    }
    
}
