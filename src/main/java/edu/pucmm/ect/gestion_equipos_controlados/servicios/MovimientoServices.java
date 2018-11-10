package edu.pucmm.ect.gestion_equipos_controlados.servicios;

import edu.pucmm.ect.gestion_equipos_controlados.repositorios.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimientoServices {

    @Autowired
    private MovimientoRepository movimientoRepository;

}
