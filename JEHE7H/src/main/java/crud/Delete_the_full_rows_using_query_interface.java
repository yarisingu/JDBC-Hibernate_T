package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
 

public class Delete_the_full_rows_using_query_interface {

	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Query query  = entityManager.createQuery("delete from std");
		entityTransaction.begin();
		query.executeUpdate();
		entityTransaction.commit();
		System.out.println("data removed successfully");
		entityManager.close();
		
	}

}
