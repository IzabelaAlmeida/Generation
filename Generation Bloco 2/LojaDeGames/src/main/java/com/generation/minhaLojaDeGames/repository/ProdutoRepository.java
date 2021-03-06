package com.generation.minhaLojaDeGames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.minhaLojaDeGames.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel,Long> {
	public List<ProdutoModel>findAllbyTituloContainingIgnoreCase(String preco);
}

