package com.unicauca.posgrados.apigestionreservasalones.repository;

import com.unicauca.posgrados.apigestionreservasalones.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
