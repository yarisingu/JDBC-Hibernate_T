package many_to_one_uni;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Deparment {
	
	@Id
	int d_id;
	@Column
	String d_name;
	@OneToMany
	List<Students> std;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public List<Students> getStd() {
		return std;
	}
	public void setStd(List<Students> std) {
		this.std = std;
	}
	
}
