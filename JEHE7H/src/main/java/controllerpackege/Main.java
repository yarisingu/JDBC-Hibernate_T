package controllerpackege;

import java.util.List;
import java.util.Scanner;

import dao.Acess_the_object_for_dao;
import dto.Create_the_table;

public class Main {

	public static void main(String[] args) {
		Create_the_table  ctt = new Create_the_table();
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(count<=n)
		{
		Acess_the_object_for_dao atbd = new Acess_the_object_for_dao();
		System.out.println("Enter the id");
		int i= sc.nextInt();
		System.out.println("Enter the name");
		String s= sc.next();
		System.out.println("Enter the email id");
		String s1 = sc.next();
		System.out.println("Enter the ph");
		int i1=sc.nextInt();
		ctt.setE_id(i);
		ctt.setE_name(s);
		ctt.setE_email(s1);
		ctt.setE_ph(i1);
		atbd.insert(ctt);
		count++;
		}
		sc.close();
		
		Acess_the_object_for_dao atbd = new Acess_the_object_for_dao();
		@SuppressWarnings("unchecked")
		List<Create_the_table> list = atbd.fetch().getResultList();
		for(Create_the_table createthetable : list)
		{
			System.out.println(createthetable.getE_id());
		}
	int a	= list.size();
	System.out.println(a);
		
	}
}
