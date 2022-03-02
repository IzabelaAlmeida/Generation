package com.generation.blogPessoal.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity //indica q essa classe vai ser uma entidade do JPA - postagem
@Table(name = "postagem") //dentro do banco de dados essa entidade, vai virar uma tabela 
public class Postagem {

	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto_incremento, chave primaria
	private long id; // bigint
	
	@NotNull
	@Size(min = 5, max = 100)//determina a qtd de caracter q o cliente consegue enviar 
	private String titulo;
	
	@NotNull
	@Size(min = 5, max = 500) 
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());
	//assim que passar algum dado por essa classe, vai calcular a data,segundo e milesio,é uma opção colocar
	
	@ManyToOne //Muitos para um
	@JsonIgnoreProperties("postagem")
	private TemaModel tema;

	
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

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}; 
	
	
	

}
