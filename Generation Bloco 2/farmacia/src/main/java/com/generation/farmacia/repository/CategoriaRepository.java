package com.generation.farmacia.repository;

import java.util.List;
import com.generation.farmacia.model.CategoriaModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel,Long>{
	public List<CategoriaModel>findAllByTituloContainingIgnoreCase(String titulo);
	
}



