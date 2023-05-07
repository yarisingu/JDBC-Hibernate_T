package controllerpackege;

import dao.Acess_the_object_delete;
import dto.Create_the_table;

public class MainDelete {

	public static void main(String[] args) 
	{
		Create_the_table ct = new Create_the_table();
		Acess_the_object_delete ad  = new Acess_the_object_delete();
		ad.delete();
		System.out.println("entire rows values has been deleted");
		

	}

}
