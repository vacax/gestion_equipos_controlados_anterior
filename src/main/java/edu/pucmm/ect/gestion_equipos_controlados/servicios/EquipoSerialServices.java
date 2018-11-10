package edu.pucmm.ect.gestion_equipos_controlados.servicios;

import edu.pucmm.ect.gestion_equipos_controlados.repositorios.EquipoSerialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoSerialServices {

    @Autowired
    private EquipoSerialRepository equipoSerialRepository;

}
