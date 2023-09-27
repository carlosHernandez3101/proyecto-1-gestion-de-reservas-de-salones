package com.unicauca.servicesalones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.unicauca.servicesalones.entity.Salon;
import com.unicauca.servicesalones.repository.SalonRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SalonServiceImpl implements SalonService {

    private SalonRepository salonRepository;

    @Override
    public Salon createSalon(Salon salon) {
        return salonRepository.save(salon);
    }

    @Override
    public Salon getSalonById(Long idSalon) {
        Optional<Salon> optionalSalon = salonRepository.findById(idSalon);
        return optionalSalon.get();
    }

    @Override
    public List<Salon> getAllSalones() {
        return salonRepository.findAll();
    }

    @Override
    public Salon updateSalon(Salon salon) {
        Salon existingSalon = salonRepository.findById(salon.getIdSalon()).get();
        existingSalon.setCapacidad(salon.getCapacidad());
        existingSalon.setNumeracionSalon(salon.getNumeracionSalon());
        return salonRepository.save(existingSalon);
    }

    @Override
    public void deleteSalon(Long idSalon) {
        salonRepository.deleteById(idSalon);
    }
    
}
