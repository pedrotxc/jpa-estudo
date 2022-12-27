package br.com.petshop.dao;

import javax.persistence.EntityManager;

import br.com.petshop.entidades.Cuidador;

public class CuidadorDAO {
	EntityManager em;
	
	public CuidadorDAO(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Cuidador cuidador) {
		this.em.persist(cuidador);
	}
	
	public void atualizar(Cuidador cuidador) {
		this.em.merge(cuidador);
	}
}
