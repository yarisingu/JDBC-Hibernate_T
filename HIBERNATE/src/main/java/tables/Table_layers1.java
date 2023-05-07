package tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="emp")
public class Table_layers1 {

	@Id
	int e_id;
	@Column
	String e_name;
	@Column
	String e_eid;
	@Column
	int e_ph;
	
}
