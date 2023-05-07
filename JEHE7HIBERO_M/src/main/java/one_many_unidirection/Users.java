package one_many_unidirection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	String ud;
	@Column
	int pwd;
	public String getUd() {
		return ud;
	}
	public void setUd(String ud) {
		this.ud = ud;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	
	
}
