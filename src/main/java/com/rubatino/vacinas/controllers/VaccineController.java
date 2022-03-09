package com.rubatino.vacinas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubatino.vacinas.entities.Vaccine;
import com.rubatino.vacinas.services.VaccineService;

@RestController
@RequestMapping(value = "/vaccines")
public class VaccineController {
	
	@Autowired
	VaccineService vaccineService;
	
	@GetMapping
	public ResponseEntity<List<Vaccine>> findAll(){
		List<Vaccine> list = vaccineService.findAll();
		return ResponseEntity.ok().body(list);
	}
}
