package crud;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Insert_to_table2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		System.out.println("insert how many times you want to insert the data");
		int re = sc.nextInt();
		int count=0;
		while(count<=re)
		{
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			Table2 t2 =new Table2();
			System.out.println("Insert the data in this format integer string string integer");
			int i= sc.nextInt();
			String s= sc.next();
			String s1=sc.next();
			int i1=sc.nextInt();
			t2.setK_id(i);
			t2.setK_name(s);
			t2.setK_email(s1);
			t2.setK_ph(i1);
			entityManager.getTransaction().begin();
			entityManager.persist(t2);
			entityManager.getTransaction().commit();
			System.out.println("insert the values sucessfully");
			count++;
		}
		sc.close();
		entityManagerFactory.close();
	}

}
