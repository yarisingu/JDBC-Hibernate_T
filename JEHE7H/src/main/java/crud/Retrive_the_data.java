package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Retrive_the_data {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Table1 createthetable= entityManager.find(Table1.class, 1);	
		System.out.println("s_id "+createthetable.s_id+" s_name  "+createthetable.s_name+"s_email  "+createthetable.s_eid+" s_phone   "+createthetable.s_ph);
		System.out.println("data fetch sucessfully");
		entityManager.close();
	}
}
