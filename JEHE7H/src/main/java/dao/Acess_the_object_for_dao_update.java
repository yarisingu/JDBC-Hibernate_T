package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Create_the_table;

public class Acess_the_object_for_dao_update {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void update(Create_the_table ctt)
	{
		entityTransaction.begin();
		entityManager.merge(ctt);
		entityTransaction.commit();
	}

}
