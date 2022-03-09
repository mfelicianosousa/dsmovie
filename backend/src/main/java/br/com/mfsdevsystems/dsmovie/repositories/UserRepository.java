package br.com.mfsdevsystems.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mfsdevsystems.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail( String email );
}
