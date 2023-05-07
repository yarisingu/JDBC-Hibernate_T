package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev1");
		EntityManager entityManager =	entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		SoftwareCompany softwareCompany = new SoftwareCompany();
		softwareCompany.setSc_id(1001);
		softwareCompany.setSc_name("Tcl");
		
		Client client = new Client();
		client.setC_id(1);
		client.setC_name("Swiggy");
		client.setSoft(softwareCompany);
		
		Client client2 = new Client();
		client2.setC_id(2);
		client2.setC_name("food_panda");
		client2.setSoft(softwareCompany);

		Client client3 = new Client();
		client3.setC_id(3);
		client3.setC_name("zomato");
		client3.setSoft(softwareCompany);
		
		entityTransaction.begin();
		entityManager.persist(softwareCompany);
		entityManager.persist(client);
		entityManager.persist(client2);
		entityManager.persist(client3);
		entityTransaction.commit();
		System.out.println("data added sucessfully");

	}

}
