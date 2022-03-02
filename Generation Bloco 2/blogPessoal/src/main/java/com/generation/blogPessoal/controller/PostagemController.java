package com.generation.blogPessoal.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.generation.blogPessoal.repository.PostagemRepository;
import com.generation.blogPessoal.model.Postagem;


@RestController
@RequestMapping("/postagens") 
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class PostagemController {
	
		
	@Autowired 
	private PostagemRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll (){
		return ResponseEntity.ok(repository.findAll()); // OK = 200
	}
	@GetMapping("/{id}")
	public ResponseEntity<Postagem>getByIdEntity(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/nome/{nome}") //buscar por nome de postagem
    public ResponseEntity<List<Postagem>> getByNome(@PathVariable String texto){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(texto));
		
	}
	@PostMapping
	public ResponseEntity<Postagem>post(@RequestBody Postagem texto){
	return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(texto));
	
	}
	@PutMapping
	public ResponseEntity<Postagem>put(@RequestBody Postagem texto){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(texto));
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
		
		
		
		
		

	
	

	
	
	

}
