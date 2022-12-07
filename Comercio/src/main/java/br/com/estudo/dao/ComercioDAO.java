package br.com.estudo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.estudo.modelo.Comercio;

public class ComercioDAO {
	
	EntityManager em;
	
	public ComercioDAO(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Comercio comercio) {
		this.em.persist(comercio);
	}
	
	public Comercio atualizar(Comercio comercio) {
		return this.em.merge(comercio);
	}
	
	public void remover(Comercio comercio) {
		this.em.remove(comercio);
	}
	
	public Comercio buscarPorId(Long id) {
		return this.em.find(Comercio.class, id);		
	}
	
	public List<Comercio>buscarTodos() {
		String jpql = "select c from Comercio c";
		return em.createQuery(jpql, Comercio.class).getResultList();
	}
	
	public Comercio buscarPorNome(String nome) {
		String jpql = "select c from Comercio c where c.nome = :nome";
		return em.createQuery(jpql, Comercio.class).setParameter("nome", nome).getSingleResult();
	}
	
	public List<Comercio> buscarPorNomeDaCategoria(String descricao) {
		String jpql = "select c from Comercio c where c.categoria.descricao = :descricao";
		return em.createQuery(jpql, Comercio.class).setParameter("descricao", descricao).getResultList();
	}
	
	public String buscarEnderecoPeloNome(String nome) {
		String jpql = "select c.endereço from Comercio c where c.nome = :nome";
		return em.createQuery(jpql, String.class).setParameter("nome", nome).getSingleResult();
	}
}
