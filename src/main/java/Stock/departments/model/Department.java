package Stock.departments.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Departments")
public class Department {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(name = "Dept_Code")
	private String Dept_Code;
	
	@Column(name = "Dept_Name")
	private String Dept_Name;
	
	@Column(name = "Dept_Desc")
	private String Dept_Desc;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getDept_Code() {
		return Dept_Code;
	}

	public void setDept_Code(String dept_Code) {
		Dept_Code = dept_Code;
	}

	public String getDept_Desc() {
		return Dept_Desc;
	}

	public void setDept_Desc(String dept_Desc) {
		Dept_Desc = dept_Desc;
	}

	public String getDept_Name() {
		return Dept_Name;
	}

	public void setDept_Name(String dept_Name) {
		Dept_Name = dept_Name;
	}
	
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
			.append("\"id\": \"").append(getId()).append("\",")
			.append("\"Dept_Name\": \"").append(getDept_Name()).append("\",")
			.append("\"Dept_Desc\": \"").append(getDept_Desc()).append("\",")
			.append("\"Dept_Code\": \"").append(getDept_Code()).append("\"");
		sb.append("}");
		
		return sb.toString();
		
	}
	
	

}
