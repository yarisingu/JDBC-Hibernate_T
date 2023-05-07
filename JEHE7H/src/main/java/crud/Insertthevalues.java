package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insertthevalues 
{
public static void main(String[] args) 
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	Table1 createthetable= new Table1();
	createthetable.setS_id(1);
	createthetable.setS_name("kumar");
	createthetable.setS_eid("kumar@gmail.com");
	createthetable.setS_ph(9874155);
	entityTransaction.begin();
	entityManager.persist(createthetable);
	entityTransaction.commit();
	System.out.println("data has been inserted successfully");
	entityManager.close();
}
}
