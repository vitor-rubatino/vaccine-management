package com.rubatino.vacinas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubatino.vacinas.entities.Vaccine;

public interface VaccineRepository extends JpaRepository<Vaccine, Long> {

}
