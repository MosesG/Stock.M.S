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

	@Column(name = "Prod_Name")
	private String Prod_Name;
	
	@Column(name = "Sale_Quantity")
	private int Sale_Quantity;
	
	@Column(name = "Sale_Price")
	private double Sale_Price;

	@Column(name = "Sale_Total")
	private double Sale_Total;

	@Column(name = "Sale_Customer")
	private Long Sale_Customer;

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

	public double getSale_Total() {
		return Sale_Total;
	}

	public void setSale_Total(double sale_Total) {
		Sale_Total = sale_Total;
	}

	public String getProd_Name() {
		return Prod_Name;
	}

	public void setProd_Name(String prod_Name) {
		Prod_Name = prod_Name;
	}

	public Long getSale_Customer() {
		return Sale_Customer;
	}

	public void setSale_Customer(Long sale_Customer) {
		Sale_Customer = sale_Customer;
	}



	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
			.append("\"id\": \"").append(getId()).append("\",")
			.append("\"Prod_Name\": \"").append(getProd_Name()).append("\",")
			.append("\"Sale_Quantity\": \"").append(getSale_Quantity()).append("\",")
			.append("\"Sale_Price\": \"").append(getSale_Price()).append("\",")
			.append("\"Sale_Total\": \"").append(getSale_Total()).append("\",")
			.append("\"Sale_Customer\": \"").append(getSale_Customer()).append("\",")
			.append("\"Sale_Time\": \"").append(getSale_Time()).append("\"");
		sb.append("}");
		
		return sb.toString();
		
	}
	
	

}
