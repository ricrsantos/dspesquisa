package com.ricardo.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>
{
	

}
