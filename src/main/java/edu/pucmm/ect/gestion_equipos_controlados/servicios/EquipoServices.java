package edu.pucmm.ect.gestion_equipos_controlados.servicios;

import edu.pucmm.ect.gestion_equipos_controlados.entidades.Equipo;
import edu.pucmm.ect.gestion_equipos_controlados.repositorios.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EquipoServices {

    @Autowired
    private EquipoRepository equipoRepository;

    @Transactional
    public Equipo crearEquipo(Equipo equipo){
        equipoRepository.save(equipo);
        return equipo;
    }

    @Transactional
    public Equipo editarEquipo(Equipo equipo){
        equipoRepository.save(equipo);
        return equipo;
    }


}
