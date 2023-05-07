package many_manybidirection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dea");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("Now + you have to enter the data");
		int n= sc.nextInt();
		for(int i=0;i<=n;i++)
		{
		Teacher ter = new Teacher();
		ter.setT_id(sc.nextInt());
		ter.setT_name(sc.next());
		List<Teacher> list =  new ArrayList<Teacher>();
		list.add(ter);
		
		Students ser = new Students();
		ser.setS_roll(sc.nextInt());
		ser.setS_name(sc.next());
		List<Students> list1 =  new ArrayList<Students>();
		list1.add(ser);
		ter.setUsr(list1);
		ser.setTer(list);
		
		entityTransaction.begin();
		entityManager.persist(ter);
		entityManager.persist(ser);
		entityTransaction.commit();
		System.out.println(i+ "st data inserte sucessfully");
		}
		sc.close();

	}

}
