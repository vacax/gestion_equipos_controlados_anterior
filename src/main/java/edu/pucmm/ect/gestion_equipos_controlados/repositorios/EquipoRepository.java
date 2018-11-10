package edu.pucmm.ect.gestion_equipos_controlados.repositorios;

import edu.pucmm.ect.gestion_equipos_controlados.entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EquipoRepository extends JpaRepository<Equipo,Long> {
}
