package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dto.Create_the_table;

public class Acess_the_object_fetch {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	public Create_the_table fetch(int i1)
	{
		Create_the_table cr = entityManager.find(Create_the_table.class, i1);
		//System.out.println(cr.getE_id()+"  "+cr.getE_name()+"  "+cr.getE_email()+"   "+cr.getE_ph());
		return cr;
	}
	
}
