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
@Table(name = "Depo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Depo.findAll", query = "SELECT d FROM Depo d"),
    @NamedQuery(name = "Depo.findByIdDepo", query = "SELECT d FROM Depo d WHERE d.idDepo = :idDepo"),
    @NamedQuery(name = "Depo.findByAdi", query = "SELECT d FROM Depo d WHERE d.adi = :adi"),
    @NamedQuery(name = "Depo.findByMehsulunSayi", query = "SELECT d FROM Depo d WHERE d.mehsulunSayi = :mehsulunSayi")})
public class Depo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDepo")
    private Integer idDepo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Adi")
    private String adi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "MehsulunSayi")
    private String mehsulunSayi;
    @JoinColumn(name = "idMehsul", referencedColumnName = "idMehsul")
    @ManyToOne(optional = false)
    private Mehsul idMehsul;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepo")
    private Collection<Satish> satishCollection;

    public Depo() {
    }

    public Depo(Integer idDepo) {
        this.idDepo = idDepo;
    }

    public Depo(Integer idDepo, String adi, String mehsulunSayi) {
        this.idDepo = idDepo;
        this.adi = adi;
        this.mehsulunSayi = mehsulunSayi;
    }

    public Integer getIdDepo() {
        return idDepo;
    }

    public void setIdDepo(Integer idDepo) {
        this.idDepo = idDepo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getMehsulunSayi() {
        return mehsulunSayi;
    }

    public void setMehsulunSayi(String mehsulunSayi) {
        this.mehsulunSayi = mehsulunSayi;
    }

    public Mehsul getIdMehsul() {
        return idMehsul;
    }

    public void setIdMehsul(Mehsul idMehsul) {
        this.idMehsul = idMehsul;
    }

    @XmlTransient
    public Collection<Satish> getSatishCollection() {
        return satishCollection;
    }

    public void setSatishCollection(Collection<Satish> satishCollection) {
        this.satishCollection = satishCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepo != null ? idDepo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Depo)) {
            return false;
        }
        Depo other = (Depo) object;
        if ((this.idDepo == null && other.idDepo != null) || (this.idDepo != null && !this.idDepo.equals(other.idDepo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Depo.Entity.Depo[ idDepo=" + idDepo + " ]";
    }
    
}
