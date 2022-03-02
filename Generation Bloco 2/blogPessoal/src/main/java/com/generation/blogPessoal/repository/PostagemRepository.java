package com.generation.blogPessoal.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.blogPessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> { //id - Long ?? pq é a chave primaria long
	public List<Postagem>findAllByTituloContainingIgnoreCase(String texto);
// findAll(buscar todos), By(pelo), Titulo(pode ser qualquer atributo da minha model postagem)            
//Containing(a mesma coisa do like do sql), IgnoreCase(não levar em consideração maiúsc. e minúsc.
	
}
