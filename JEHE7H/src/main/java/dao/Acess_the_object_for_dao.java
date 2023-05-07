package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Create_the_table;

public class Acess_the_object_for_dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	public void insert(Create_the_table itt)
	{
		entityManager.getTransaction().begin();
		entityManager.persist(itt);
		entityManager.getTransaction().commit();
	}
	
	public Query fetch()
	{
		Query query = entityManager.createQuery("select a from emp a",Create_the_table.class);
		return query;
	}
}