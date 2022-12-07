package br.com.estudo.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("comercio");
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
