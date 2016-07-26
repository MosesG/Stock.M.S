package Stock.categories.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import Stock.departments.model.Department;

@Entity
@Table(name = "Category")
public class Category {
	
	private static final long serialVersionUID = 1L;
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(name = "Cat_Name")
	private String Cat_Name;
	
	@ManyToOne
	private Department depatments;
	
	public Department getDepatments() {
		return depatments;
	}

	public void setDepatments(Department depatments) {
		this.depatments = depatments;
	}

	@Transient
	private Long Cat_Dept;
	
	@Transient
	private Long Cat_DeptId;
	
	public Long getCat_DeptId() {
		return Cat_DeptId;
	}

	public void setCat_DeptId(Long cat_DeptId) {
		Cat_DeptId = cat_DeptId;
	}

	@Column(name = "Cat_Code")
	private String Cat_Code;
	
	@Column(name = "Cat_Desc", columnDefinition = "TEXT")
	private String Cat_Desc;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCat_Name() {
		return Cat_Name;
	}

	public void setCat_Name(String cat_Name) {
		Cat_Name = cat_Name;
	}

	public String getCat_Desc() {
		return Cat_Desc;
	}

	public void setCat_Desc(String cat_Desc) {
		Cat_Desc = cat_Desc;
	}
	
	public Long getCat_Dept() {
		return Cat_Dept;
	}

	public void setCat_Dept(Long cat_Dept) {
		Cat_Dept = cat_Dept;
	}

	public String getCat_Code() {
		return Cat_Code;
	}

	public void setCat_Code(String cat_Code) {
		Cat_Code = cat_Code;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
			.append("\"id\": \"").append(getId()).append("\",")
			.append("\"Cat_Name\": \"").append(getCat_Name()).append("\",")
			.append("\"Cat_Code\": \"").append(getCat_Code()).append("\",")
			.append("\"Cat_Dept\": \"").append(getDepatments().getDept_Name()).append("\",")
			.append("\"Cat_DeptId\": \"").append(getDepatments().getId()).append("\",")
			.append("\"Cat_Desc\": \"").append(getCat_Desc()).append("\"");
		sb.append("}");
		
		return sb.toString();
		
	}

}
