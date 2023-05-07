package many_manybidirection;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Students {
	
	@Id
	int s_roll;
	@Column
	String s_name;
	
	@ManyToMany
	List<Teacher> ter;

	public int getS_roll() {
		return s_roll;
	}

	public void setS_roll(int s_roll) {
		this.s_roll = s_roll;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public List<Teacher> getTer() {
		return ter;
	}

	public void setTer(List<Teacher> ter) {
		this.ter = ter;
	}
	
	

	
}
