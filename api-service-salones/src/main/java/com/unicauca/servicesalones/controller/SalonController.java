package com.unicauca.servicesalones.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicauca.servicesalones.entity.Salon;
import com.unicauca.servicesalones.service.SalonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/salones")
@AllArgsConstructor
public class SalonController {

    private SalonService salonService;

    @PostMapping
    public ResponseEntity<Salon> createSalon(@RequestBody Salon salon){
        Salon savedSalon = salonService.createSalon(null);
        return new ResponseEntity<>(savedSalon, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Salon> getSalonById(@PathVariable("id") Long idSalon){
        Salon salon = salonService.getSalonById(idSalon);
        return new ResponseEntity<>(salon, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Salon>> getAllSalones(){
        List<Salon> salones = salonService.getAllSalones();
        return new ResponseEntity<>(salones, HttpStatus.OK);        
    }

    @PutMapping("{id}")
    public ResponseEntity<Salon> updateSalon(@PathVariable("id") Long idSalon, @RequestBody Salon salon){
        salon.setIdSalon(idSalon);
        Salon updatedSalon = salonService.updateSalon(salon);
        return new ResponseEntity<>(updatedSalon, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteSalon(@PathVariable Long idSalon){
        salonService.deleteSalon(idSalon);
        return new ResponseEntity<>("Salon borrado satisfactoriamente!", HttpStatus.OK);
    }
    
}
