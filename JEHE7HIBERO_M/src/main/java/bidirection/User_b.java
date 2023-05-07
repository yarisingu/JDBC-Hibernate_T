package bidirection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User_b {
	@Id
	String un;
	@Column
	long pwd;
	@OneToOne
	User_a user_a;
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
	public User_a getUser_a() {
		return user_a;
	}
	public void setUser_a(User_a user_a) {
		this.user_a = user_a;
	}
}
