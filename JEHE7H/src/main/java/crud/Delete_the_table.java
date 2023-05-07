 package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_the_table {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Table1 createthetable = entityManager.find(Table1.class,1);
		entityTransaction.begin();
		entityManager.remove(createthetable);
		entityTransaction.commit();
		entityManager.close();

	}

}
