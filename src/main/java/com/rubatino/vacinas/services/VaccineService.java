package com.rubatino.vacinas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubatino.vacinas.entities.Vaccine;
import com.rubatino.vacinas.repositories.VaccineRepository;

@Service
public class VaccineService {
	
	@Autowired
	VaccineRepository vaccineRepository;
	
	public List<Vaccine> findAll(){
		return vaccineRepository.findAll();
	}
}
