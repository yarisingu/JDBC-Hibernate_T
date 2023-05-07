package many_to_one_uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller_m__o_u {

	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev1");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Deparment  deparment = new Deparment();
	deparment.setD_name("klm");
	deparment.setD_id(100);
	
	Students s = new  Students();
	s.setS_name("avani");
	s.setS_id(5656);
	
	Students std = new  Students();
	std.setS_name("pavani");
	std.setS_id(5256);
	
	Students std1 = new  Students();
	std1.setS_name("arun"); 
	std1.setS_id(5646);
	
	List<Students> list = new ArrayList<Students>();
	list.add(s);
	list.add(std);
	list.add(std1);
	deparment.setStd(list);
	
	entityTransaction.begin();
	entityManager.persist(deparment);
	entityManager.persist(s);
	entityManager.persist(std);
	entityManager.persist(std1);
	entityTransaction.commit();
	System.out.println("mapping done sucessfully");
	}
	
}
