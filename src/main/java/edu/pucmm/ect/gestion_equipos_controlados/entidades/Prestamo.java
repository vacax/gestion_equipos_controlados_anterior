package edu.pucmm.ect.gestion_equipos_controlados.entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Prestamo {

    @Id
    private long id;
    private String nombreEstudiante;
    private String matriculaStudiante;
    private Date fechaSolicitud;
    private Date fechaEntrega;
    @ManyToOne(fetch = FetchType.EAGER)
    private EstadoPrestamo estadoPrestamo;
    @OneToOne
    private Prestamo prestamoRenovado;
    @OneToMany(mappedBy = "prestamo")
    private List<PrestamoDetalle> listaPrestamoDetalle;
    private boolean habilitado;

    public Prestamo() {
    }

    public Prestamo(String nombreEstudiante, String matriculaStudiante, Date fechaSolicitud, Date fechaEntrega,
                    EstadoPrestamo estadoPrestamo, Prestamo prestamoRenovado,
                    List<PrestamoDetalle> listaPrestamoDetalle, boolean habilitado) {
        setNombreEstudiante(nombreEstudiante);
        setMatriculaStudiante(matriculaStudiante);
        setFechaSolicitud(fechaSolicitud);
        setFechaEntrega(fechaEntrega);
        setEstadoPrestamo(estadoPrestamo);
        setPrestamoRenovado(prestamoRenovado);
        setListaPrestamoDetalle(listaPrestamoDetalle);
        setHabilitado(habilitado);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getMatriculaStudiante() {
        return matriculaStudiante;
    }

    public void setMatriculaStudiante(String matriculaStudiante) {
        this.matriculaStudiante = matriculaStudiante;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public EstadoPrestamo getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(EstadoPrestamo estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    public Prestamo getPrestamoRenovado() {
        return prestamoRenovado;
    }

    public void setPrestamoRenovado(Prestamo prestamoRenovado) {
        this.prestamoRenovado = prestamoRenovado;
    }

    public List<PrestamoDetalle> getListaPrestamoDetalle() {
        return listaPrestamoDetalle;
    }

    public void setListaPrestamoDetalle(List<PrestamoDetalle> listaPrestamoDetalle) {
        this.listaPrestamoDetalle = listaPrestamoDetalle;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
