package br.com.petshop.entidades;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "cachorros")
@Entity
public class Cachorro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String raça;
	private String cor;
	@Enumerated(EnumType.STRING)
	private Porte porte;
	@ManyToOne
	private Cuidador cuidador;

	public Cachorro() {
		
	}
	
	public Cachorro(String nome, String raça, String cor, Porte porte, Cuidador cuidador) {
		this.nome = nome;
		this.raça = raça;
		this.cor = cor;
		this.porte = porte;
		this.cuidador = cuidador;
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

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public Cuidador getCuidador() {
		return cuidador;
	}

	public void setCuidador(Cuidador cuidador) {
		this.cuidador = cuidador;
	}

	@Override
	public String toString() {
		return "Cachorro [id=" + id + ", nome=" + nome + ", raça=" + raça + ", cor=" + cor + ", porte=" + porte
				+ ", cuidador=" + cuidador + "]";
	}
	
}
