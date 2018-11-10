package edu.pucmm.ect.gestion_equipos_controlados.servicios;

import edu.pucmm.ect.gestion_equipos_controlados.entidades.CategoriaEquipo;
import edu.pucmm.ect.gestion_equipos_controlados.repositorios.CategoriaEquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.transaction.Transactional;

@Service
public class CategoriaEquipoServices {

    @Autowired
    private CategoriaEquipoRepository categoriaEquipoRepository;


    @Transactional
    public CategoriaEquipo crearCategoriaEquipo(CategoriaEquipo categoriaEquipo){
        categoriaEquipoRepository.save(categoriaEquipo);
        return  categoriaEquipo;
    }

    @Transactional
    public CategoriaEquipo editarCategoriaEquipo(CategoriaEquipo categoriaEquipo){
        categoriaEquipoRepository.save(categoriaEquipo);
        return categoriaEquipo;
    }
}
