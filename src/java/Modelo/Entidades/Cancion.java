/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
 * @author ASUS
 */
@Entity
@Table(name = "CANCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cancion.findAll", query = "SELECT c FROM Cancion c")
    , @NamedQuery(name = "Cancion.findByIdcancion", query = "SELECT c FROM Cancion c WHERE c.idcancion = :idcancion")
    , @NamedQuery(name = "Cancion.findByGenero", query = "SELECT c FROM Cancion c WHERE c.genero = :genero")
    , @NamedQuery(name = "Cancion.findByFecha", query = "SELECT c FROM Cancion c WHERE c.fecha = :fecha")})
public class Cancion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCANCION")
    private Short idcancion;
    @Size(max = 15)
    @Column(name = "GENERO")
    private String genero;
    @Column(name = "FECHA")
    private Short fecha;
    @OneToMany(mappedBy = "idcancion")
    private List<Cantante> cantanteList;

    public Cancion() {
    }

    public Cancion(Short idcancion) {
        this.idcancion = idcancion;
    }

    public Short getIdcancion() {
        return idcancion;
    }

    public void setIdcancion(Short idcancion) {
        this.idcancion = idcancion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Short getFecha() {
        return fecha;
    }

    public void setFecha(Short fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public List<Cantante> getCantanteList() {
        return cantanteList;
    }

    public void setCantanteList(List<Cantante> cantanteList) {
        this.cantanteList = cantanteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcancion != null ? idcancion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cancion)) {
            return false;
        }
        Cancion other = (Cancion) object;
        if ((this.idcancion == null && other.idcancion != null) || (this.idcancion != null && !this.idcancion.equals(other.idcancion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Entidades.Cancion[ idcancion=" + idcancion + " ]";
    }
    
}
