package br.com.jonathas.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonathas.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
