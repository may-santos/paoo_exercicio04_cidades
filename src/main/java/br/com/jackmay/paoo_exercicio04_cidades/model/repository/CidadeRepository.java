package br.com.jackmay.paoo_exercicio04_cidades.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jackmay.paoo_exercicio04_cidades.model.beans.Cidade;


public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	public Cidade findOneByLatitudeAndLongitude(String latitude, String longitude);
	
	public List<Cidade> findAllByNomeStartingWith(String letra);
	
}