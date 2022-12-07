package br.com.estudo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comercio")
public class Comercio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String endereço;
	@ManyToOne
	private Categoria categoria;
	
	public Comercio() {
		
	}
	
	public Comercio(String nome, String endereco, Categoria categoria) {
		this.nome = nome;
		this.endereço = endereco;
		this.categoria = categoria;		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	@Override
	public String toString() {
		return "Comercio nome: " + this.nome + ", Comercio endereço: " + this.endereço;
	}
}
