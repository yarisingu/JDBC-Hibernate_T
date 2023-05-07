package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Retrive_using_queryinterface {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select a from kool a",Table2.class);
		@SuppressWarnings("unchecked")
		List<Table2> list = query.getResultList();
		for(Table2 t1 : list)
		{
			System.out.println(t1.getK_id()+"    "+t1.getK_name());
		}
		
		
	}

}
