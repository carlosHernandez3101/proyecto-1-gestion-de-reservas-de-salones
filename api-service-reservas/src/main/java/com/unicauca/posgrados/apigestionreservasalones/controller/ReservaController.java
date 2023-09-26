package com.unicauca.posgrados.apigestionreservasalones.controller;

import com.unicauca.posgrados.apigestionreservasalones.modelo.Reserva;
import com.unicauca.posgrados.apigestionreservasalones.service.ReservaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/reservas")
public class ReservaController {

    private ReservaService reservaService;

    @PostMapping
    public ResponseEntity<Reserva> createReserva(Reserva reserva){
        Reserva savedReserva = reservaService.createReserva(reserva);
        return new ResponseEntity<>(savedReserva, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Reserva> getReservaById(@PathVariable("id") Long idReserva){
        Reserva reserva = reservaService.getReservaById(idReserva);
        return new ResponseEntity<>(reserva, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Reserva>> getAllReservas(){
        List<Reserva> reservas = reservaService.getAllReservas();
        return new ResponseEntity<>(reservas, HttpStatus.OK);
    }

    public ResponseEntity<String> removeReserva(@PathVariable("id") Long idReserva){
        reservaService.removeReserva(idReserva);
        return new ResponseEntity<>("Reserva eliminada satisfactoriamente", HttpStatus.OK);
    }

}
