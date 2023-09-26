package com.unicauca.posgrados.apigestionreservasalones.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
    private Long idSalon;
    private Long CedulaCiudadania;
    private Long AdmCedulaCiudadania;
    private Long DocCedulaCiudadania;
    private Integer horasSolicitadas;
    private Integer numeroDeEstudiantes;
    private String estadoReserva;
    private String programaPosgrado;
    private String edificio;
    private String ubicacionDocente;
    private String mensaje;
    private Date fechaReserva;

}
