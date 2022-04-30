package OnlineStore;

/**
 * 
 */

/**
 * @author Busra
 *
 */

import java.time.LocalDate;

public class FoodItem extends Product{	 
	

// make this a subclass of Product
	private LocalDate mfgDate, expirationDate;
	// constructor

	public FoodItem(String name, String id, int quantity, LocalDate mfg, LocalDate exp, double price) {
		super(name, id,Category.Food, quantity, price);
		this.mfgDate=mfg;
		this.expirationDate=exp;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	// This method will put an item on sale if the item expires 
	// within next few days which will be decided by the admin.
	@Override
	public void putOnSale(Object criterion, int P) {
		int days=(int)criterion;
		int remaining_days=this.getExpirationDate().compareTo(LocalDate.now());
		if(remaining_days>=0) {
			if(remaining_days<=days) {
				this.setOnSale(true);
				this.setSalePercent(P);
			}
			else {
				System.out.printf("Will expire in more than "+days+" days.\n");
			}
		}else {
			System.out.printf("Product is already expired.\n");
		}
		
		
	}
	
	// This details method is for admin user. Admin should be able to see everything.
	public String details() {
		//return "name=" + this.getName() + "\tid=" + this.getId() + "\tcategory=" + this.getCategory() + "\tquantity=" + this.getQuantity() + "\tprice="
			//	+ this.totalPrice(this.getQuantity()) + "\tonSale=" + this.isOnSale() + "\tsalePercent=" + this.getSalePercent();
		return super.details();
	}	
}