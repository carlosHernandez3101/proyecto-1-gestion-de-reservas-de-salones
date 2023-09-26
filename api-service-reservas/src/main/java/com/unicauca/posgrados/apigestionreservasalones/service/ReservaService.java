package com.unicauca.posgrados.apigestionreservasalones.service;

import com.unicauca.posgrados.apigestionreservasalones.modelo.Reserva;

import java.util.List;

public interface ReservaService {

    Reserva createReserva(Reserva reserva);

    Reserva getReservaById(Long idReserva);

    List<Reserva> getAllReservas();

    Reserva updateReserva(Reserva reserva);

    void removeReserva(Long idReserva);

}
