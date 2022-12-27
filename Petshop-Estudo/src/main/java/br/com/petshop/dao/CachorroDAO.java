package br.com.petshop.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.petshop.entidades.Cachorro;

public class CachorroDAO {

	EntityManager em;
	
	public CachorroDAO(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Cachorro cachorro) {
		this.em.persist(cachorro);
	}
	
	public Cachorro atualizar(Cachorro cachorro) {
		return this.em.merge(cachorro);
	}	
	
	public Cachorro buscarPorId(Cachorro cachorro, Long id) {
		return this.em.find(Cachorro.class, id);
	}
	
	public List<Cachorro> buscarTodos(){
		String jpql = "SELECT c from Cachorro c";
		return this.em.createQuery(jpql, Cachorro.class).getResultList();
	}
	
	public List<Cachorro> buscarCachorroPorNome(String nome){
		String jpql = "SELECT c from Cachorro c where c.nome = :nome";
		return this.em.createQuery(jpql, Cachorro.class).setParameter("nome", nome).getResultList();
	}
	
	public List<Cachorro> buscarPorNomeDoCuidador(String nome){
		String jpql = "SELECT c from Cachorro c where c.cuidador.nome = :nome";
		return this.em.createQuery(jpql, Cachorro.class).setParameter("nome", nome).getResultList();
	}
	
	public String buscarNomeDoCachorro(String nome) {
		String jpql = "select c.nome from Cachorro c where c.nome = :nome";
		return this.em.createQuery(jpql, String.class).setParameter("nome", nome).getSingleResult();
	}
}
