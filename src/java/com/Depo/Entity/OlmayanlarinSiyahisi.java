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
@Table(name = "OlmayanlarinSiyahisi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OlmayanlarinSiyahisi.findAll", query = "SELECT o FROM OlmayanlarinSiyahisi o"),
    @NamedQuery(name = "OlmayanlarinSiyahisi.findByIdOlmayanlarinSiyahisi", query = "SELECT o FROM OlmayanlarinSiyahisi o WHERE o.idOlmayanlarinSiyahisi = :idOlmayanlarinSiyahisi"),
    @NamedQuery(name = "OlmayanlarinSiyahisi.findByMiqdari", query = "SELECT o FROM OlmayanlarinSiyahisi o WHERE o.miqdari = :miqdari"),
    @NamedQuery(name = "OlmayanlarinSiyahisi.findByIsActive", query = "SELECT o FROM OlmayanlarinSiyahisi o WHERE o.isActive = :isActive")})
public class OlmayanlarinSiyahisi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idOlmayanlarinSiyahisi")
    private Integer idOlmayanlarinSiyahisi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Miqdari")
    private String miqdari;
    @Size(max = 45)
    @Column(name = "isActive")
    private String isActive;
    @JoinColumn(name = "idSifarishInfo", referencedColumnName = "idSifarishInfo")
    @ManyToOne(optional = false)
    private SifarishInfo idSifarishInfo;

    public OlmayanlarinSiyahisi() {
    }

    public OlmayanlarinSiyahisi(Integer idOlmayanlarinSiyahisi) {
        this.idOlmayanlarinSiyahisi = idOlmayanlarinSiyahisi;
    }

    public OlmayanlarinSiyahisi(Integer idOlmayanlarinSiyahisi, String miqdari) {
        this.idOlmayanlarinSiyahisi = idOlmayanlarinSiyahisi;
        this.miqdari = miqdari;
    }

    public Integer getIdOlmayanlarinSiyahisi() {
        return idOlmayanlarinSiyahisi;
    }

    public void setIdOlmayanlarinSiyahisi(Integer idOlmayanlarinSiyahisi) {
        this.idOlmayanlarinSiyahisi = idOlmayanlarinSiyahisi;
    }

    public String getMiqdari() {
        return miqdari;
    }

    public void setMiqdari(String miqdari) {
        this.miqdari = miqdari;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public SifarishInfo getIdSifarishInfo() {
        return idSifarishInfo;
    }

    public void setIdSifarishInfo(SifarishInfo idSifarishInfo) {
        this.idSifarishInfo = idSifarishInfo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOlmayanlarinSiyahisi != null ? idOlmayanlarinSiyahisi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OlmayanlarinSiyahisi)) {
            return false;
        }
        OlmayanlarinSiyahisi other = (OlmayanlarinSiyahisi) object;
        if ((this.idOlmayanlarinSiyahisi == null && other.idOlmayanlarinSiyahisi != null) || (this.idOlmayanlarinSiyahisi != null && !this.idOlmayanlarinSiyahisi.equals(other.idOlmayanlarinSiyahisi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Depo.Entity.OlmayanlarinSiyahisi[ idOlmayanlarinSiyahisi=" + idOlmayanlarinSiyahisi + " ]";
    }
    
}
