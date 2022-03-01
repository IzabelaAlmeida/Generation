package com.generation.minhaLojaDeGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.generation.minhaLojaDeGames.model.UsuarioModel;

@Entity
@Table(name = "tb_usuario")
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min= 5, max=16)
	private String CPF;
	
	@NotBlank
	@Size(min= 5, max=50)
	private String usuario; 
	
	@NotBlank
	@Size(min= 5, max=100)
	private String nome;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL) // onetomany - um para muitos
	@JsonIgnoreProperties("usuario")
	private List<ProdutoModel> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ProdutoModel> getProduto() {
		return produto;
	}

	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}
	
   
	
}
