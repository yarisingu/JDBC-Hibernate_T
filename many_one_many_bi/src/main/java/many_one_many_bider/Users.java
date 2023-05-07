package many_one_many_bider;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Users {
	
	@Id
	int u_id;
	@Column
	String u_name;
	@ManyToOne
	Providers u_pro;
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public Providers getU_pro() {
		return u_pro;
	}
	public void setU_pro(Providers u_pro) {
		this.u_pro = u_pro;
	}
	

}
