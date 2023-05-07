package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class S_conroller {

	
	
	public static void save(Students std)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sev");
		EntityManager entityManager =	entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction  =	entityManager.getTransaction();
			entityTransaction.begin();
		entityManager.persist(std);
		entityTransaction.commit();
	}
}
