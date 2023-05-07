package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetch_the_datausing_query_interface {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select a from  std a",Table1.class);
		@SuppressWarnings("unchecked")
		List<Table1> list = query.getResultList();
		for(Table1 createthetable : list)
		{
			System.out.println("s_id  "+createthetable.s_id+"  s_ename  "+createthetable.s_name+"  s_eid  "+createthetable.s_eid+"  s_ph "+createthetable.s_ph);
		}
		entityManager.close();
	}
	
}
 

