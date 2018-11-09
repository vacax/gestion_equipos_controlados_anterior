package edu.pucmm.ect.gestion_equipos_controlados.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PrestamoDetalle {

    @Id
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Prestamo prestamo;
    @ManyToOne(fetch = FetchType.EAGER)
    private Equipo equipo;
    private int cantidadPendienteEntrega;
    private int cantidadPrestado;
    @ManyToOne(fetch = FetchType.EAGER)
    private EquipoSerial equipoSerial;
    private boolean entregado;
    private boolean habilitado;

    public PrestamoDetalle(){}

    public PrestamoDetalle(Prestamo prestamo, Equipo equipo, int cantidadPendienteEntrega, int cantidadPrestado,
                           EquipoSerial equipoSerial, boolean entregado, boolean habilitado) {
        setPrestamo(prestamo);
        setEquipo(equipo);
        setCantidadPendienteEntrega(cantidadPendienteEntrega);
        setCantidadPrestado(cantidadPrestado);
        setEquipoSerial(equipoSerial);
        setEntregado(entregado);
        setHabilitado(habilitado);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getCantidadPendienteEntrega() {
        return cantidadPendienteEntrega;
    }

    public void setCantidadPendienteEntrega(int cantidadPendienteEntrega) {
        this.cantidadPendienteEntrega = cantidadPendienteEntrega;
    }

    public int getCantidadPrestado() {
        return cantidadPrestado;
    }

    public void setCantidadPrestado(int cantidadPrestado) {
        this.cantidadPrestado = cantidadPrestado;
    }

    public EquipoSerial getEquipoSerial() {
        return equipoSerial;
    }

    public void setEquipoSerial(EquipoSerial equipoSerial) {
        this.equipoSerial = equipoSerial;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
