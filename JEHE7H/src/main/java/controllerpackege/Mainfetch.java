package controllerpackege;

import java.util.Scanner;

import dao.Acess_the_object_fetch;
import dto.Create_the_table;

public class Mainfetch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Create_the_table  ctt = new Create_the_table();
		
		Acess_the_object_fetch af = new Acess_the_object_fetch();
		System.out.println("  Enter the id to fetch");
		int i= sc.nextInt();
		System.out.println(af.fetch(i).getE_id()+" "+af.fetch(i).getE_name()+" "+af.fetch(i).getE_email()+" "+af.fetch(i).getE_ph());
		
	}

}
