package one_one_unidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager	entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User_1 user_1 = new User_1();
		User_2 user_2 = new User_2();
		user_2.setUn("Acho");
		user_2.setPwd(1111);
		
		user_1.setUn("raju");
		user_1.setPwd(123);
		user_1.setUser_2(user_2);
		
		entityTransaction.begin();
		entityManager.persist(user_2);
		entityManager.persist(user_1);
		entityTransaction.commit();
		System.out.println("maping done sucessfully");
	}
}


