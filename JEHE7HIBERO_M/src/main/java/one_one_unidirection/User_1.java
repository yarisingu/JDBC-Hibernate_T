package one_one_unidirection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity()
public class User_1 {
	@Id
	String un;
	@Column
	long pwd;
	@OneToOne
	User_2 user_2;
	
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
	public User_2 getUser_2() {
		return user_2;
	}
	public void setUser_2(User_2 user_2) {
		this.user_2 = user_2;
	}
	
}
