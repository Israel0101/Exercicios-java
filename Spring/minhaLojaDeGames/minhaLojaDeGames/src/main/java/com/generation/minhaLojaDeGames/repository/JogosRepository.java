package com.generation.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.minhaLojaDeGames.model.jogos;

@Repository
public interface JogosRepository extends JpaRepository<jogos, Long>{
	public List<jogos> findAllByNomeContainingIgnoreCase (String nome);

}
