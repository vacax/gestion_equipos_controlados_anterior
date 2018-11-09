package edu.pucmm.ect.gestion_equipos_controlados.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movimiento {

    public enum TipoMovimiento {
        ENTRADA, SALIDA
    }

    @Id
    private long id;
    private int cantidad;
    @ManyToOne(fetch = FetchType.EAGER)
    private Equipo equipo;
    private TipoMovimiento tipoMovimiento;
    private boolean habilitado;

    public Movimiento() {
    }

    public Movimiento(int cantidad, Equipo equipo, TipoMovimiento tipoMovimiento, boolean habilitado) {
        setCantidad(cantidad);
        setEquipo(equipo);
        setTipoMovimiento(tipoMovimiento);
        setHabilitado(habilitado);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
