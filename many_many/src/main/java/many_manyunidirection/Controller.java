package many_manyunidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev1");
		EntityManager  entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction  entityTransaction = entityManager.getTransaction();
		
		Network_providers network_providers = new Network_providers();
		network_providers.setN_id(6665651);
		network_providers.setN_name("jio");
		
		Network_providers network_providers1 = new Network_providers();
		network_providers1.setN_id(8524);
		network_providers1.setN_name("BSNL");
		
		Users users = new Users();
		users.setU_id(95506345);
		users.setU_name("tarun");
		
		Users users1 = new Users();
		users1.setU_id(5656);
		users1.setU_name("ambani");
		
		List<Users> list = new ArrayList<Users>();
		list.add(users);
		list.add(users1);
		
		network_providers.setUser(list);
		 network_providers1.setUser(list);
		 
	  entityTransaction.begin();
	  entityManager.persist(network_providers);
	  entityManager.persist(network_providers1);
	  entityManager.persist(users);
	  entityManager.persist(users1);
	
	  entityTransaction.commit();
	  System.out.println("data set and insert sucezsfully");
		
		
		
		
		
	}
}
