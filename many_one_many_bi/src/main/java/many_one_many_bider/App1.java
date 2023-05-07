package many_one_many_bider;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App1 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Providers pr = new Providers();
		pr.setP_id(523001);
		pr.setP_name("swigy");
		Users ur = new Users();
		
		ur.setU_id(100);
		ur.setU_name("java");
		ur.setU_pro(pr);
		
		Users ur1 = new Users();
		
		ur1.setU_id(200);
		ur1.setU_name("SQL");
		ur1.setU_pro(pr);
		
		Users ur2 = new Users();
		
		ur2.setU_id(300);
		ur2.setU_name("cpp");
		ur2.setU_pro(pr);
		
		List<Users> list = new ArrayList();
		
		list.add(ur);
		list.add(ur1);
		list.add(ur2);
		
		pr.setU_ser(list);
		
		entityTransaction.begin();
		entityManager.persist(pr);
		entityManager.persist(ur);
		entityManager.persist(ur1);
		entityManager.persist(ur2);
		entityTransaction.commit();
		System.out.println("created data base sucessfully");
		

	}

}
