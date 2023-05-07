package controllerpackege;

import java.util.Scanner;

import dao.Acess_the_object_for_dao_update;
import dto.Create_the_table;

public class Mainupdate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Create_the_table  ctt = new Create_the_table();
		Acess_the_object_for_dao_update au = new Acess_the_object_for_dao_update();
		System.out.println("  Enter the id to update");
		int i= sc.nextInt();
		System.out.println("Enter the name to update");
		String s= sc.next();
		System.out.println("Enter the email to update");
		String s1 = sc.next();
		System.out.println("Enter the ph to update");
		int i1 = sc.nextInt();
		
		ctt.setE_id(i);
		ctt.setE_name(s);
		ctt.setE_email(s1);
		ctt.setE_ph(i1);
		
		System.out.println(" Data was inserted");
		au.update(ctt);
	}

}
