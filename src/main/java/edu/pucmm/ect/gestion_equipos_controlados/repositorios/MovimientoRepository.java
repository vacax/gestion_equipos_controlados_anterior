package edu.pucmm.ect.gestion_equipos_controlados.repositorios;

import edu.pucmm.ect.gestion_equipos_controlados.entidades.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
}
