package crud;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Establish_the_connection {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		System.out.println("connection establish done");
		entityManagerFactory.close();
	}

}
