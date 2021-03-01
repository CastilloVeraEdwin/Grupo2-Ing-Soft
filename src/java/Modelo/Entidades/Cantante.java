/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Entidades;

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
 * @author ASUS
 */
@Entity
@Table(name = "CANTANTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cantante.findAll", query = "SELECT c FROM Cantante c")
    , @NamedQuery(name = "Cantante.findByIdcantante", query = "SELECT c FROM Cantante c WHERE c.idcantante = :idcantante")
    , @NamedQuery(name = "Cantante.findByNombrecantante", query = "SELECT c FROM Cantante c WHERE c.nombrecantante = :nombrecantante")
    , @NamedQuery(name = "Cantante.findByNacionalidad", query = "SELECT c FROM Cantante c WHERE c.nacionalidad = :nacionalidad")
    , @NamedQuery(name = "Cantante.findByEdad", query = "SELECT c FROM Cantante c WHERE c.edad = :edad")
    , @NamedQuery(name = "Cantante.findByNombrecancion", query = "SELECT c FROM Cantante c WHERE c.nombrecancion = :nombrecancion")})
public class Cantante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCANTANTE")
    private Short idcantante;
    @Size(max = 20)
    @Column(name = "NOMBRECANTANTE")
    private String nombrecantante;
    @Size(max = 15)
    @Column(name = "NACIONALIDAD")
    private String nacionalidad;
    @Column(name = "EDAD")
    private Short edad;
    @Size(max = 20)
    @Column(name = "NOMBRECANCION")
    private String nombrecancion;
    @JoinColumn(name = "IDCANCION", referencedColumnName = "IDCANCION")
    @ManyToOne
    private Cancion idcancion;

    public Cantante() {
    }

    public Cantante(Short idcantante) {
        this.idcantante = idcantante;
    }

    public Short getIdcantante() {
        return idcantante;
    }

    public void setIdcantante(Short idcantante) {
        this.idcantante = idcantante;
    }

    public String getNombrecantante() {
        return nombrecantante;
    }

    public void setNombrecantante(String nombrecantante) {
        this.nombrecantante = nombrecantante;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public String getNombrecancion() {
        return nombrecancion;
    }

    public void setNombrecancion(String nombrecancion) {
        this.nombrecancion = nombrecancion;
    }

    public Cancion getIdcancion() {
        return idcancion;
    }

    public void setIdcancion(Cancion idcancion) {
        this.idcancion = idcancion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcantante != null ? idcantante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cantante)) {
            return false;
        }
        Cantante other = (Cantante) object;
        if ((this.idcantante == null && other.idcantante != null) || (this.idcantante != null && !this.idcantante.equals(other.idcantante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Entidades.Cantante[ idcantante=" + idcantante + " ]";
    }
    
}
