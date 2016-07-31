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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Mehsul")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mehsul.findAll", query = "SELECT m FROM Mehsul m"),
    @NamedQuery(name = "Mehsul.findByIdMehsul", query = "SELECT m FROM Mehsul m WHERE m.idMehsul = :idMehsul"),
    @NamedQuery(name = "Mehsul.findByAdi", query = "SELECT m FROM Mehsul m WHERE m.adi = :adi"),
    @NamedQuery(name = "Mehsul.findByAlishDeyeri", query = "SELECT m FROM Mehsul m WHERE m.alishDeyeri = :alishDeyeri"),
    @NamedQuery(name = "Mehsul.findBySatishDeyeri", query = "SELECT m FROM Mehsul m WHERE m.satishDeyeri = :satishDeyeri"),
    @NamedQuery(name = "Mehsul.findByBarkod", query = "SELECT m FROM Mehsul m WHERE m.barkod = :barkod")})
public class Mehsul implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idMehsul")
    private Integer idMehsul;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Adi")
    private String adi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "AlishDeyeri")
    private String alishDeyeri;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SatishDeyeri")
    private String satishDeyeri;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Barkod")
    private String barkod;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMehsul")
    private Collection<Depo> depoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMehsul")
    private Collection<SifarishInfo> sifarishInfoCollection;
    @JoinColumn(name = "idFirma", referencedColumnName = "idFirma")
    @ManyToOne(optional = false)
    private Firma idFirma;

    public Mehsul() {
    }

    public Mehsul(Integer idMehsul) {
        this.idMehsul = idMehsul;
    }

    public Mehsul(Integer idMehsul, String adi, String alishDeyeri, String satishDeyeri, String barkod) {
        this.idMehsul = idMehsul;
        this.adi = adi;
        this.alishDeyeri = alishDeyeri;
        this.satishDeyeri = satishDeyeri;
        this.barkod = barkod;
    }

    public Integer getIdMehsul() {
        return idMehsul;
    }

    public void setIdMehsul(Integer idMehsul) {
        this.idMehsul = idMehsul;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getAlishDeyeri() {
        return alishDeyeri;
    }

    public void setAlishDeyeri(String alishDeyeri) {
        this.alishDeyeri = alishDeyeri;
    }

    public String getSatishDeyeri() {
        return satishDeyeri;
    }

    public void setSatishDeyeri(String satishDeyeri) {
        this.satishDeyeri = satishDeyeri;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    @XmlTransient
    public Collection<Depo> getDepoCollection() {
        return depoCollection;
    }

    public void setDepoCollection(Collection<Depo> depoCollection) {
        this.depoCollection = depoCollection;
    }

    @XmlTransient
    public Collection<SifarishInfo> getSifarishInfoCollection() {
        return sifarishInfoCollection;
    }

    public void setSifarishInfoCollection(Collection<SifarishInfo> sifarishInfoCollection) {
        this.sifarishInfoCollection = sifarishInfoCollection;
    }

    public Firma getIdFirma() {
        return idFirma;
    }

    public void setIdFirma(Firma idFirma) {
        this.idFirma = idFirma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMehsul != null ? idMehsul.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mehsul)) {
            return false;
        }
        Mehsul other = (Mehsul) object;
        if ((this.idMehsul == null && other.idMehsul != null) || (this.idMehsul != null && !this.idMehsul.equals(other.idMehsul))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Depo.Entity.Mehsul[ idMehsul=" + idMehsul + " ]";
    }
    
}
