package com.ricardo.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>
{
	

}
