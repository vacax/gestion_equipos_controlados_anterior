package edu.pucmm.ect.gestion_equipos_controlados.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CategoriaEquipo {

    @Id
    private long id;
    private String categoria;
    private boolean habilitado;

    public CategoriaEquipo(){}

    public CategoriaEquipo(String categoria, boolean habilitado){
        setCategoria(categoria);
        setHabilitado(habilitado);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
