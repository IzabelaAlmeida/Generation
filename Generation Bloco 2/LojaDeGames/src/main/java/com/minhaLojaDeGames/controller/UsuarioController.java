package com.minhaLojaDeGames.controller;

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
import com.generation.minhaLojaDeGames.model.UsuarioModel;
import com.generation.minhaLojaDeGames.repository.UsuarioRepository;

@RestController //identificar como controller
@RequestMapping("/usuario") // identificador de url
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository; //
	
	@GetMapping
	public ResponseEntity<List<UsuarioModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<UsuarioModel>getByIdEntity(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		
	}
	@PostMapping
	public ResponseEntity<UsuarioModel>post(@RequestBody UsuarioModel usuario){
	return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
	
	}
	@PutMapping
	public ResponseEntity<UsuarioModel>put(@RequestBody UsuarioModel usuario){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(usuario));
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
