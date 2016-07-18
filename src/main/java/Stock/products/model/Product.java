package Stock.products.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Products")
public class Product {
	
	private static final long serialVersionUID = 1L;
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(name = "Prod_Name")
	private String Prod_Name;
	
	@Column(name = "Prod_Cat")
	private Long Prod_Cat;
	
	@Column(name = "Prod_Code")
	private String Prod_Code;
	
	@Column(name = "StockLevel")
	private int StockLevel;
	
	@Column(name = "Prod_Price")
	private double Prod_Price;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getProd_Name() {
		return Prod_Name;
	}

	public void setProd_Name(String prod_Name) {
		Prod_Name = prod_Name;
	}

	public Long getProd_Cat() {
		return Prod_Cat;
	}

	public void setProd_Cat(Long prod_Cat) {
		Prod_Cat = prod_Cat;
	}

	public String getProd_Code() {
		return Prod_Code;
	}

	public void setProd_Code(String prod_Code) {
		Prod_Code = prod_Code;
	}

	public int getStockLevel() {
		return StockLevel;
	}

	public void setStockLevel(int stockLevel) {
		StockLevel = stockLevel;
	}

	public double getProd_Price() {
		return Prod_Price;
	}

	public void setProd_Price(double prod_Price) {
		Prod_Price = prod_Price;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getJson(){
		StringBuilder sb = new StringBuilder();
		sb.append("{")
			.append("\"id\": \"").append(getId()).append("\",")
			.append("\"Prod_Name\": \"").append(getProd_Name()).append("\",")
			.append("\"Prod_Cat\": \"").append(getProd_Cat()).append("\",")
			.append("\"Prod_Code\": \"").append(getProd_Code()).append("\",")
			.append("\"StockLevel\": \"").append(getStockLevel()).append("\",")
			.append("\"Prod_Price\": \"").append(getProd_Price()).append("\"");
		sb.append("}");
		
		return sb.toString();
		
	}

}
