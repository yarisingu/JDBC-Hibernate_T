package bidirection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User_a {
	@Id
	String un;
	@Column
	long pwd;
	@OneToOne
	User_b user_b;
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public long getPwd() {
		return pwd;
	}
	public void setPwd(long pwd) {
		this.pwd = pwd;
	} 
	public User_b getUser_b() {
		return user_b;
	}
	public void setUser_b(User_b user_b) {
		this.user_b = user_b;
	}
}
