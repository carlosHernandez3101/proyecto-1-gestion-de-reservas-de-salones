package com.unicauca.posgrados.apigestionreservasalones.service;

import com.unicauca.posgrados.apigestionreservasalones.modelo.Reserva;
import com.unicauca.posgrados.apigestionreservasalones.repository.ReservaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReservaServiceImpl implements ReservaService {

    private ReservaRepository reservaRepository;

    @Override
    public Reserva createReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva getReservaById(Long idReserva) {
        Optional<Reserva> optionalReserva = reservaRepository.findById(idReserva);
        return optionalReserva.get();
    }

    @Override
    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Reserva updateReserva(Reserva reserva) {
        Reserva existingReserva = reservaRepository.findById(reserva.getIdReserva()).get();
        return null;
    }

    @Override
    public void removeReserva(Long idReserva) {
        reservaRepository.deleteById(idReserva);
    }
}
