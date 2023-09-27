package com.unicauca.servicesalones.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "salones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Salon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSalon;
    private Long idEdificio;
    private Integer capacidad;
    private Integer numeracionSalon;

}
