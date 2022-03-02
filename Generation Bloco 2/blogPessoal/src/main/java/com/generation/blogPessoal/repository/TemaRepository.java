package com.generation.blogPessoal.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.blogPessoal.model.TemaModel;

@Repository
public interface TemaRepository extends JpaRepository<TemaModel,Long>{
	public List<TemaModel>findAllByTituloContainingIgnoreCase(String titulo);
	
}
