package hibernateconfigaration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="login")
public class Table1 {
	@Id
	private int l_id;
	@Column
	private String l_uname;
	@Column
	private String l_email;
	@Column
	private int l_ph;
	
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getL_uname() {
		return l_uname;
	}
	public void setL_uname(String l_uname) {
		this.l_uname = l_uname;
	}
	public String getL_email() {
		return l_email;
	}
	public void setL_email(String l_email) {
		this.l_email = l_email;
	}
	public int getL_ph() {
		return l_ph;
	}
	public void setL_ph(int l_ph) {
		this.l_ph = l_ph;
	}
	public String getL_pwd() {
		return l_pwd;
	}
	public void setL_pwd(String l_pwd) {
		this.l_pwd = l_pwd;
	}
	private String l_pwd;

}
