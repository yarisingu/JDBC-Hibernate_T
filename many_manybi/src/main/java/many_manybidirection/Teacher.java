package many_manybidirection;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {
	
	@Id
	int t_id;
	@Column
	String t_name;
	
	
	@ManyToMany
	List<Students> usr;


	public int getT_id() {
		return t_id;
	}


	public void setT_id(int t_id) {
		this.t_id = t_id;
	}


	public String getT_name() {
		return t_name;
	}


	public void setT_name(String t_name) {
		this.t_name = t_name;
	}


	public List<Students> getUsr() {
		return usr;
	}


	public void setUsr(List<Students> usr) {
		this.usr = usr;
	}
	
	

}
