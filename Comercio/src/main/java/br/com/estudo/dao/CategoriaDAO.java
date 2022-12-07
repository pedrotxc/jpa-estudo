package br.com.estudo.dao;

import javax.persistence.EntityManager;

import br.com.estudo.modelo.Categoria;

public class CategoriaDAO {
	EntityManager em;
	
	public CategoriaDAO(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Categoria categoria) {
		this.em.persist(categoria);
	}
}
