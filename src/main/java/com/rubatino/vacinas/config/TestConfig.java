package com.rubatino.vacinas.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rubatino.vacinas.entities.User;
import com.rubatino.vacinas.entities.Vaccine;
import com.rubatino.vacinas.repositories.UserRepository;
import com.rubatino.vacinas.repositories.VaccineRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	VaccineRepository vaccineRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Vitor Rubatino", "vitor@teste.com", "13752041650", Instant.parse("2019-06-20T19:53:07Z"));
		User u2 = new User(null, "Gabi Pivoto", "gabi@teste.com", "12345678910", Instant.parse("2019-06-20T19:53:07Z"));

		userRepository.saveAll(Arrays.asList(u1, u2));
		
		Vaccine v1 = new Vaccine(null, "PFIZER", Instant.parse("2021-02-25T10:33:07Z"), "Reforço", "Alfenas", u1);
		Vaccine v2 = new Vaccine(null, "ASTRAZENICA", Instant.parse("2020-08-25T10:33:07Z"), "1º Dose", "Caxambu", u1);
		Vaccine v3 = new Vaccine(null, "ASTRAZENICA", Instant.parse("2020-08-25T10:33:07Z"), "2º Dose", "Caxambu", u1);
		Vaccine v4 = new Vaccine(null, "PFIZER", Instant.parse("2020-08-25T10:33:07Z"), "1º Dose", "Liberdade", u2);
		Vaccine v5 = new Vaccine(null, "ASTRAZENICA", Instant.parse("2020-08-25T10:33:07Z"), "2º Dose", "São Paulo", u2);
		
		vaccineRepository.saveAll(Arrays.asList(v1, v2, v3, v4, v5));
	}
}
