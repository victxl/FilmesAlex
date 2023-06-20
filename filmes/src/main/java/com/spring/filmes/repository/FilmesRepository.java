package com.spring.filmes.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.filmes.models.Filme;

public interface FilmesRepository extends CrudRepository<Filme, String> {
	Filme findByCodigoFilme(long codigoFilme);
}
