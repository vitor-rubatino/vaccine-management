package com.rubatino.vacinas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubatino.vacinas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
