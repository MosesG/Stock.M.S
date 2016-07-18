package Stock.sales.model;

public class SalesModel {
	
	private Long Id;
	
	private int Sale_Quantity;
	
	private double Sale_Price;
	
	private Long Prod_Id;

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
	
	

}
