package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Curd_operation {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
//		Table1 t1 = new Table1();
//		t1.setS_id(2);
//		t1.setS_name("hgf");
//		t1.setS_eid("kjhgf@765");
//		t1.setS_ph(54125);
//		entityManager.getTransaction().begin();
//		entityManager.persist(t1);
//		entityManager.getTransaction().commit();
//		System.out.println("data enter sucessfully");
//		
//		Query query = entityManager.createQuery("select a from std a",Table1.class);
//		@SuppressWarnings("unchecked")
//		List<Table1> list = query.getResultList();
//		for(Table1 t11 : list)
//		{
//			System.out.println(t11.getS_id()+" , "+t11.getS_name()+" ,  "+t11.getS_eid()+" ,  "+t11.getS_ph());
//		}
//		
//		System.out.println("delete the row");
//		
//		Table1 t2 =entityManager.find(Table1.class, 4);
//		entityManager.getTransaction().begin();
//		entityManager.remove(t2);
//		entityManager.getTransaction().commit();
//		System.out.println(" Delete data sucessfully");
//		
//		
//		System.out.println("update the table");
//		Table1 t4=entityManager.find(Table1.class,2);
//		t4.setS_id(2);
//		t4.setS_name("simha");
//		t4.setS_eid("simha@gmail.com");
//		t4.setS_ph(7532156);
//		entityManager.getTransaction().begin();
//		entityManager.persist(t4);
//		entityManager.getTransaction().commit();
//		System.out.println("data update sucessfully");
		
		entityManager.getTransaction().begin();
		Query query2 = entityManager.createNativeQuery("ALTER TABLE std ADD COLUMN s_pwd VARCHAR(255)");
		query2.executeUpdate(); 
		entityManager.getTransaction().commit();
		
		
		
		
//	Table1 t2 = entityManager.find(Table1.class,2);
//		System.out.println(t2.s_eid+"  "+t2.s_ph+"  "+t2.s_name+"  "+t2.s_id);
	}

}
