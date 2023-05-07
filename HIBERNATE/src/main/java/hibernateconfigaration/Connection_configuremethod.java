package hibernateconfigaration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connection_configuremethod {

	public static void main(String[] args) {
		Table1 t1 = new Table1();
		t1.setL_id(1);
		t1.setL_uname("tarun");
		t1.setL_email("tarun@gmail.com");
		t1.setL_ph(654126);
		t1.setL_pwd("tarun@gmail.com");
		Configuration con = new Configuration().configure().addAnnotatedClass(Table1.class);
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.save(t1);
		session.close();
	}

}
