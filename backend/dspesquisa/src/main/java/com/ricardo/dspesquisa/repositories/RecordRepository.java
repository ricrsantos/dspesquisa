package com.ricardo.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>
{
	

}
