package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Acess_the_object_delete {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager	entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
	     Query query=	entityManager.createQuery("delete from emp");
	     
	     public void delete() 
	    {
	    	 entityTransaction.begin();
	    	 query.executeUpdate();
	    	 entityTransaction.commit();
	    	 
	    	 
		}
		
			
			 
			 

}
