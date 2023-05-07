package many_one_many_bider;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Providers {
	
	@Id
	int p_id;
	@Column
	String p_name;
	@OneToMany
	List<Users> u_ser;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public List<Users> getU_ser() {
		return u_ser;
	}
	public void setU_ser(List<Users> u_ser) {
		this.u_ser = u_ser;
	}
	
}
