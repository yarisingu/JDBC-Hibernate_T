package manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Client {

	@Id
	String c_name;
	@Column
	int c_id;
	@ManyToOne
	SoftwareCompany soft;
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public SoftwareCompany getSoft() {
		return soft;
	}
	public void setSoft(SoftwareCompany soft) {
		this.soft = soft;
	}
}
