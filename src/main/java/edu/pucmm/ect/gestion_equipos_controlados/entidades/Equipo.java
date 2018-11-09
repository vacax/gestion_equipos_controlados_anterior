package edu.pucmm.ect.gestion_equipos_controlados.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Equipo {

    @Id
    private long id;
    private String nombre;
    private boolean habilitado;
    private long cantidadTotal;
    private long cantidadDisponible;

    public Equipo() {}

    public Equipo(String nombre, boolean habilitado, long cantidadTotal, long cantidadDisponible) {
        setNombre(nombre);
        setHabilitado(habilitado);
        setCantidadTotal(cantidadTotal);
        setCantidadDisponible(cantidadDisponible);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public long getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(long cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public long getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(long cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}
