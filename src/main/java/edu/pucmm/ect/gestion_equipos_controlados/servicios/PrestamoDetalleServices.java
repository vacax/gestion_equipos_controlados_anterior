package edu.pucmm.ect.gestion_equipos_controlados.servicios;

import edu.pucmm.ect.gestion_equipos_controlados.repositorios.PrestamoDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestamoDetalleServices {

    @Autowired
    private PrestamoDetalleRepository prestamoDetalleRepository;

}
