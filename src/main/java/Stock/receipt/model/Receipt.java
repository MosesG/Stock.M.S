package Stock.receipt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Receipts")
public class Receipt {
	
	private static final long serialVersionUID = 1L;
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{").append("\"id\": \"").append(getId()).append("\"");
		sb.append("}");
		
		return sb.toString();
	}


}
