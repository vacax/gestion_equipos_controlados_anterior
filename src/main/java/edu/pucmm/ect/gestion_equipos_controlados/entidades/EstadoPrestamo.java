package edu.pucmm.ect.gestion_equipos_controlados.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EstadoPrestamo {

    @Id
    private long id;
    private String estado;
    private boolean habilitado;

    public EstadoPrestamo(){}

    public EstadoPrestamo(String estado, boolean habilitado) {
        setEstado(estado);
        setHabilitado(habilitado);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
