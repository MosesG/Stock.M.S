package Stock.sales.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sales")
public class Sales {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(name = "Sale_Quantity")
	private int Sale_Quantity;
	
	@Column(name = "Sale_Price")
	private double Sale_Price;
	
	@Column(name = "Prod_Id")
	private Long Prod_Id;
	
	@Column(name = "Sale_Time", columnDefinition = "DATE" )
	private String Sale_Time;

	public String getSale_Time() {
		return Sale_Time;
	}

	public void setSale_Time(String sale_Time) {
		Sale_Time = sale_Time;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getSale_Quantity() {
		return Sale_Quantity;
	}

	public void setSale_Quantity(int sale_Quantity) {
		Sale_Quantity = sale_Quantity;
	}

	public double getSale_Price() {
		return Sale_Price;
	}

	public void setSale_Price(double sale_Price) {
		Sale_Price = sale_Price;
	}

	public Long getProd_Id() {
		return Prod_Id;
	}

	public void setProd_Id(Long prod_Id) {
		Prod_Id = prod_Id;
	}
	
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
			.append("\"id\": \"").append(getId()).append("\",")
			.append("\"Prod_Id\": \"").append(getSale_Quantity()).append("\",")
			.append("\"Sale_Quantity\": \"").append(getSale_Quantity()).append("\",")
			.append("\"Sale_Price\": \"").append(getSale_Price()).append("\",")
			.append("\"sale_Time\": \"").append(getSale_Price()).append("\"");
		sb.append("}");
		
		return sb.toString();
		
	}
	
	

}
