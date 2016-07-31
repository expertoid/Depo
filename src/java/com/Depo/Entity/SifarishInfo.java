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
@Table(name = "SifarishInfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SifarishInfo.findAll", query = "SELECT s FROM SifarishInfo s"),
    @NamedQuery(name = "SifarishInfo.findByIdSifarishInfo", query = "SELECT s FROM SifarishInfo s WHERE s.idSifarishInfo = :idSifarishInfo"),
    @NamedQuery(name = "SifarishInfo.findByMehsulunMiqdari", query = "SELECT s FROM SifarishInfo s WHERE s.mehsulunMiqdari = :mehsulunMiqdari"),
    @NamedQuery(name = "SifarishInfo.findBySatishQiymeti", query = "SELECT s FROM SifarishInfo s WHERE s.satishQiymeti = :satishQiymeti")})
public class SifarishInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSifarishInfo")
    private Integer idSifarishInfo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "MehsulunMiqdari")
    private String mehsulunMiqdari;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SatishQiymeti")
    private String satishQiymeti;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSifarishInfo")
    private Collection<OlmayanlarinSiyahisi> olmayanlarinSiyahisiCollection;
    @JoinColumn(name = "idMehsul", referencedColumnName = "idMehsul")
    @ManyToOne(optional = false)
    private Mehsul idMehsul;
    @JoinColumn(name = "idSifarish", referencedColumnName = "idSifarish")
    @ManyToOne(optional = false)
    private Sifarish idSifarish;

    public SifarishInfo() {
    }

    public SifarishInfo(Integer idSifarishInfo) {
        this.idSifarishInfo = idSifarishInfo;
    }

    public SifarishInfo(Integer idSifarishInfo, String mehsulunMiqdari, String satishQiymeti) {
        this.idSifarishInfo = idSifarishInfo;
        this.mehsulunMiqdari = mehsulunMiqdari;
        this.satishQiymeti = satishQiymeti;
    }

    public Integer getIdSifarishInfo() {
        return idSifarishInfo;
    }

    public void setIdSifarishInfo(Integer idSifarishInfo) {
        this.idSifarishInfo = idSifarishInfo;
    }

    public String getMehsulunMiqdari() {
        return mehsulunMiqdari;
    }

    public void setMehsulunMiqdari(String mehsulunMiqdari) {
        this.mehsulunMiqdari = mehsulunMiqdari;
    }

    public String getSatishQiymeti() {
        return satishQiymeti;
    }

    public void setSatishQiymeti(String satishQiymeti) {
        this.satishQiymeti = satishQiymeti;
    }

    @XmlTransient
    public Collection<OlmayanlarinSiyahisi> getOlmayanlarinSiyahisiCollection() {
        return olmayanlarinSiyahisiCollection;
    }

    public void setOlmayanlarinSiyahisiCollection(Collection<OlmayanlarinSiyahisi> olmayanlarinSiyahisiCollection) {
        this.olmayanlarinSiyahisiCollection = olmayanlarinSiyahisiCollection;
    }

    public Mehsul getIdMehsul() {
        return idMehsul;
    }

    public void setIdMehsul(Mehsul idMehsul) {
        this.idMehsul = idMehsul;
    }

    public Sifarish getIdSifarish() {
        return idSifarish;
    }

    public void setIdSifarish(Sifarish idSifarish) {
        this.idSifarish = idSifarish;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSifarishInfo != null ? idSifarishInfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SifarishInfo)) {
            return false;
        }
        SifarishInfo other = (SifarishInfo) object;
        if ((this.idSifarishInfo == null && other.idSifarishInfo != null) || (this.idSifarishInfo != null && !this.idSifarishInfo.equals(other.idSifarishInfo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Depo.Entity.SifarishInfo[ idSifarishInfo=" + idSifarishInfo + " ]";
    }
    
}
