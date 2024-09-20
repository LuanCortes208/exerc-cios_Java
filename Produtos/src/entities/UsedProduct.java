package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private Date manuFactureDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manuFactureDate) {
		super(name, price);
		this.manuFactureDate = manuFactureDate;
		
	}
	
	public Date getManuFactureDate() {
		return manuFactureDate;
	}

	public void setManuFactureDate(Date manuFactureDate) {
		this.manuFactureDate = manuFactureDate;
	}

	@Override
	public final String priceTag() {
		return super.getName() + " (used) $ " + String.format("%.2f", super.getPrice()) + 
				"(Manufacture date: " + sdf.format(manuFactureDate) + ")";
	}
	
	
}
