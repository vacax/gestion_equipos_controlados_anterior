package edu.pucmm.ect.gestion_equipos_controlados.repositorios;

import edu.pucmm.ect.gestion_equipos_controlados.entidades.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
}
