package com.vinosnayarit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinosnayarit.model.Vino;

public interface VinoRepository extends JpaRepository<Vino, Long> {
	
	List<Vino> findByTipo(String tipo);
	List<Vino> findByMarca(String marca);
	List<Vino> findByPais(String pais);

}
