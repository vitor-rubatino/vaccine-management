package com.rubatino.vacinas.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rubatino.vacinas.entities.User;
import com.rubatino.vacinas.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Vitor Rubatino", "vitor@teste.com", "13752041650",
				Instant.parse("2019-06-20T19:53:07Z"));
		User u2 = new User(null, "Gabi Pivoto", "gabi@teste.com", "12345678910", Instant.parse("2019-06-20T19:53:07Z"));

		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
