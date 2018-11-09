package edu.pucmm.ect.gestion_equipos_controlados.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EquipoSerial {

    @Id
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Equipo equipo;
    private String serial;
    private boolean prestado;
    private boolean habilitado;

    public EquipoSerial() {}

    public EquipoSerial(Equipo equipo, String serial, boolean prestado, boolean habilitado) {
        setEquipo(equipo);
        setSerial(serial);
        setPrestado(prestado);
        setHabilitado(habilitado);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
