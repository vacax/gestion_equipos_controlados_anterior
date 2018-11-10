package edu.pucmm.ect.gestion_equipos_controlados.servicios;

import edu.pucmm.ect.gestion_equipos_controlados.entidades.Prestamo;
import edu.pucmm.ect.gestion_equipos_controlados.repositorios.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PrestamoServices {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Transactional
    public Prestamo crearPrestamo(Prestamo prestamo){
        prestamoRepository.save(prestamo);
        return prestamo;
    }

    @Transactional
    public Prestamo editarPrestamo(Prestamo prestamo){
        prestamoRepository.save(prestamo);
        return prestamo;
    }
}
