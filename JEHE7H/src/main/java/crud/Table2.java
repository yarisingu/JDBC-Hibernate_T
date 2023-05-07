package crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="kool")

public class Table2 {
	
	@Id
	int k_id;
	@Column
	String k_name;
	@Column
	String k_email;
	@Column
	int k_ph;
	
	public int getK_id() {
		return k_id;
	}
	public void setK_id(int k_id) {
		this.k_id = k_id;
	}
	public String getK_name() {
		return k_name;
	}
	public void setK_name(String k_name) {
		this.k_name = k_name;
	}
	public String getK_email() {
		return k_email;
	}
	public void setK_email(String k_email) {
		this.k_email = k_email;
	}
	public int getK_ph() {
		return k_ph;
	}
	public void setK_ph(int k_ph) {
		this.k_ph = k_ph;
	}
}
