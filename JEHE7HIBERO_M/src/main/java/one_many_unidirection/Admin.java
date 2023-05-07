package one_many_unidirection;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {

	@Id
	String un;
	@Column
	int pwd;
	@OneToMany
	List<Users> user;
	//Generated setter and getter
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	public List<Users> getUser() {
		return user;
	}
	public void setUser(List<Users> user) {
		this.user = user;
	}

}
