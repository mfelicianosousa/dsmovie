package br.com.mfsdevsystems.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mfsdevsystems.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
