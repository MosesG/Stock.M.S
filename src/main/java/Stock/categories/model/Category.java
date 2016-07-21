package Stock.categories.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Category")
public class Category {
	
	private static final long serialVersionUID = 1L;
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(name = "Cat_Name")
	private String Cat_Name;
	
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
			.append("\"Cat_Code\": \"").append(getCat_Desc()).append("\",")
			.append("\"Cat_Desc\": \"").append(getCat_Code()).append("\"");
		sb.append("}");
		
		return sb.toString();
		
	}

}
