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
	private String endere�o;
	@ManyToOne
	private Categoria categoria;
	
	public Comercio() {
		
	}
	
	public Comercio(String nome, String endereco, Categoria categoria) {
		this.nome = nome;
		this.endere�o = endereco;
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
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	@Override
	public String toString() {
		return "Comercio nome: " + this.nome + ", Comercio endere�o: " + this.endere�o;
	}
}
