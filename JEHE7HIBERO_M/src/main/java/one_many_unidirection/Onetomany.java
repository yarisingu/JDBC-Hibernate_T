package one_many_unidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Onetomany {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		
		Users u =new Users();
		u.setUd("std1");
		u.setPwd(1001);
		
		Users u1 =new Users();
		u1.setUd("std2");
		u1.setPwd(1002);
		
		Users u2 =new Users();
		u2.setUd("std3");
		u2.setPwd(1003);
		
		
		List<Users> list = new ArrayList<Users>();
		 list.add(u);
		 list.add(u1);
		 list.add(u2);
		 
		 Admin a = new  Admin();
			a.setUn("Taru");
			a.setPwd(984236);
			a.setUser(list);
		 
		 entityTransaction.begin();
		 entityManager.persist(a);
		 entityManager.persist(u);
		 entityManager.persist(u1);
		 entityManager.persist(u2);
		 entityTransaction.commit();
		 
		 System.out.println(" users table created sucessfully");

	}

}
