package br.com.petshop.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("petshop"); 
	
	
	public static EntityManager getConexao() {
		return factory.createEntityManager();
	}
}
