package br.com.estudo.testes;

import javax.persistence.EntityManager;

import br.com.estudo.dao.CategoriaDAO;
import br.com.estudo.dao.ComercioDAO;
import br.com.estudo.modelo.Categoria;
import br.com.estudo.modelo.Comercio;
import br.com.estudo.util.JPAUtil;

public class TestaComercio {
	public static void main(String[] args) {
//		cadastrarProduto();
		EntityManager em = JPAUtil.getEntityManager();
		ComercioDAO comercioDAO = new ComercioDAO(em);
//		Comercio comercio = comercioDAO.buscarPorId(6l);
//		List<Comercio> comercio = comercioDAO.buscarTodos();
//		Comercio comercio = comercioDAO.buscarPorNome("Totvs");
//		List<Comercio> comercio = comercioDAO.buscarPorNomeDaCategoria("Varejo");
		String comercio = comercioDAO.buscarEnderecoPeloNome("Totvs");
		System.out.println(comercio);
		
	}

	@SuppressWarnings("unused")
	private static void cadastrarProduto() {
		EntityManager em = JPAUtil.getEntityManager();
		ComercioDAO comercioDAO = new ComercioDAO(em);
		CategoriaDAO categoriaDAO = new CategoriaDAO(em);
		
		Categoria categoria = new Categoria("Roupas");
		Comercio comercio = new Comercio("Riachuelo", "Afonso Pena", categoria);			
		
		em.getTransaction().begin();
		comercioDAO.salvar(comercio);
		em.clear();
		comercio = comercioDAO.atualizar(comercio);
		comercioDAO.remover(comercio);
		em.getTransaction().commit();
		em.close();
	}
}