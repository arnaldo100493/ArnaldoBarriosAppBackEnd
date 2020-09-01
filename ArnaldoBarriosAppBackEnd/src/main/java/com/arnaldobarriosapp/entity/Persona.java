/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arnaldobarriosapp.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author abarrios
 */
@Entity
@Table(name = "persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
    , @NamedQuery(name = "Persona.findByIdPersona", query = "SELECT p FROM Persona p WHERE p.idPersona = :idPersona")
    , @NamedQuery(name = "Persona.findByIdentificacion", query = "SELECT p FROM Persona p WHERE p.identificacion = :identificacion")
    , @NamedQuery(name = "Persona.findByTipoIdentificacion", query = "SELECT p FROM Persona p WHERE p.tipoIdentificacion = :tipoIdentificacion")
    , @NamedQuery(name = "Persona.findByNombres", query = "SELECT p FROM Persona p WHERE p.nombres = :nombres")
    , @NamedQuery(name = "Persona.findByApellidos", query = "SELECT p FROM Persona p WHERE p.apellidos = :apellidos")
    , @NamedQuery(name = "Persona.findByTelefono", query = "SELECT p FROM Persona p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Persona.findByCorreoElectronico", query = "SELECT p FROM Persona p WHERE p.correoElectronico = :correoElectronico")
    , @NamedQuery(name = "Persona.findByEdad", query = "SELECT p FROM Persona p WHERE p.edad = :edad")
    , @NamedQuery(name = "Persona.findByCiudad", query = "SELECT p FROM Persona p WHERE p.ciudad = :ciudad")
    , @NamedQuery(name = "Persona.findByOcupacion", query = "SELECT p FROM Persona p WHERE p.ocupacion = :ocupacion")
    , @NamedQuery(name = "Persona.findByFechaRegistro", query = "SELECT p FROM Persona p WHERE p.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Persona.findByFechaModificacion", query = "SELECT p FROM Persona p WHERE p.fechaModificacion = :fechaModificacion")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_persona")
    private Integer idPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "identificacion")
    private String identificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "edad")
    private String edad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ocupacion")
    private String ocupacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    public Persona() {
        this.idPersona = 0; 
        this.identificacion = "";
        this.tipoIdentificacion = "";
        this.nombres = "";
        this.apellidos = "";
        this.telefono = "";
        this.correoElectronico = "";
        this.edad = "";
        this.ciudad = "";
        this.ocupacion = "";
        this.fechaRegistro = null;
        this.fechaModificacion = null;
    }

    public Persona(Integer idPersona) {
        this.idPersona = idPersona;
        this.identificacion = "";
        this.tipoIdentificacion = "";
        this.nombres = "";
        this.apellidos = "";
        this.telefono = "";
        this.correoElectronico = "";
        this.edad = "";
        this.ciudad = "";
        this.ocupacion = "";
        this.fechaRegistro = null;
        this.fechaModificacion = null;
    }

    public Persona(String identificacion, String tipoIdentificacion, String nombres, String apellidos, String telefono, String correoElectronico, String edad, String ciudad, String ocupacion) {
        this.idPersona = 0;
        this.identificacion = identificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
        this.ciudad = ciudad;
        this.ocupacion = ocupacion;
        this.fechaRegistro = null;
        this.fechaModificacion = null;
    }
    
     public Persona(Integer idPersona, String identificacion, String tipoIdentificacion, String nombres, String apellidos, String telefono, String correoElectronico, String edad, String ciudad, String ocupacion) {
        this.idPersona = idPersona;
        this.identificacion = identificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
        this.ciudad = ciudad;
        this.ocupacion = ocupacion;
        this.fechaRegistro = null;
        this.fechaModificacion = null;
    }

    public Persona(String identificacion, String tipoIdentificacion, String nombres, String apellidos, String telefono, String correoElectronico, String edad, String ciudad, String ocupacion, Date fechaRegistro, Date fechaModificacion) {
        this.idPersona = 0;
        this.identificacion = identificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
        this.ciudad = ciudad;
        this.ocupacion = ocupacion;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }

    public Persona(Integer idPersona, String identificacion, String tipoIdentificacion, String nombres, String apellidos, String telefono, String correoElectronico, String edad, String ciudad, String ocupacion, Date fechaRegistro, Date fechaModificacion) {
        this.idPersona = idPersona;
        this.identificacion = identificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
        this.ciudad = ciudad;
        this.ocupacion = ocupacion;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arnaldobarriosapp.entity.Persona[ idPersona=" + idPersona + " ]";
    }
    
}
