package many_to_one_uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Students {

	@Id
	int s_id;
	@Column
	String s_name;
	@ManyToOne
	Deparment dep;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public Deparment getDep() {
		return dep;
	}
	public void setDep(Deparment dep) {
		this.dep = dep;
	}
	
}
