package br.com.petshop.testes;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.petshop.dao.CachorroDAO;
import br.com.petshop.entidades.Cachorro;
import br.com.petshop.util.JPAUtil;

public class TesteConsulta {
	public static void main(String[] args) {		
//		cadastrarDados();
		EntityManager em = JPAUtil.getConexao();
		CachorroDAO cachorroDAO = new CachorroDAO(em);
		
		String cachorroRetorno = cachorroDAO.buscarNomeDoCachorro("Pitoco");
		System.out.println(cachorroRetorno);

	}
	
//	private static void cadastrarDados() {
//		Cuidador cuidador = new Cuidador("Raiane", 28, "raiane@gmail.com");		
//		
//		Cachorro cachorro = new Cachorro("Pretinha", "Chow-Chow", "Marron", Porte.PEQUENO, cuidador);
//
//		EntityManager em = JPAUtil.getConexao();
//		CachorroDAO cachorroDAO = new CachorroDAO(em);
//		CuidadorDAO cuidadorDAO = new CuidadorDAO(em);
//
//		em.getTransaction().begin();
//		cuidadorDAO.cadastrar(cuidador);
//		cachorroDAO.cadastrar(cachorro);
//		em.clear();
//		cachorro = cachorroDAO.atualizar(cachorro);;
//		cachorro.setCor("Branco");
//		em.remove(cachorro);
//		em.getTransaction().commit();
//	}
//	
//	private static void buscarPorId() {
//		Cachorro cachorro = new Cachorro();
//		
//		EntityManager em = JPAUtil.getConexao();
//		CachorroDAO cachorroDAO = new CachorroDAO(em);
//		
//		Cachorro cachorroRetorno = cachorroDAO.buscarPorId(cachorro, 3L);
//		System.out.println(cachorroRetorno);
//	}
//	
//	private static void buscarPorNome() {
//		Cachorro cachorro = new Cachorro();
//		
//		EntityManager em = JPAUtil.getConexao();
//		CachorroDAO cachorroDAO = new CachorroDAO(em);
//		
//		List<Cachorro> cachorroRetorno = cachorroDAO.buscarTodos();
//		for (Cachorro cachorro2 : cachorroRetorno) {
//			System.out.println(cachorro2 );
//		}
//	}
}
