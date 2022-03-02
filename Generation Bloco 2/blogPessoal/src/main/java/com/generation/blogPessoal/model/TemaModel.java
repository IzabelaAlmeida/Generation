package com.generation.blogPessoal.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity //indica q essa classe vai ser uma entidade do JPA - postagem
@Table(name = "Tema") //dentro do banco de dados essa entidade, vai virar uma tabela 
public class TemaModel {

	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto_incremento, chave primaria
	private long id; // bigint
	
	@NotNull
	@Size(min = 5, max = 100)//determina a qtd de caracter q o cliente consegue enviar 
	private String titulo;
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL) // onetomany - um para muitos
	@JsonIgnoreProperties("tema")
	private List<TemaModel> Postagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<TemaModel> getPostagem() {
		return Postagem;
	}

	public void setPostagem(List<TemaModel> postagem) {
		Postagem = postagem;
	}
	
	
}
