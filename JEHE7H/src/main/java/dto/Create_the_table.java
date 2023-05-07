package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="emp")
public class Create_the_table {
	@Id
	int e_id;
	@Column
	String e_name;
	@Column
	String e_email;
	@Column
	int e_ph;
	
	
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_email() {
		return e_email;
	}
	public void setE_email(String e_email) {
		this.e_email = e_email;
	}
	public int getE_ph() {
		return e_ph;
	}
	public void setE_ph(int e_ph) {
		this.e_ph = e_ph;
	}
	
}
