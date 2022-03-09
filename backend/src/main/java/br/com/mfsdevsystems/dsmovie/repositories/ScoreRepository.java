package br.com.mfsdevsystems.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mfsdevsystems.dsmovie.entities.Score;

public interface ScoreRepository extends JpaRepository<Score, Long> {

}
